package vista;

import java.awt.Image;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DetallePiezaFrameR extends JFrame {

    private JLabel lblImagen;
    private JTextArea txtDetalles;
    private int idPieza;

    public DetallePiezaFrameR (int idPieza) {
        this.idPieza = idPieza;
        initComponents();
        cargarDetallesPieza();
    }

    private void initComponents() {
        setTitle("Detalle de la Pieza");
        setSize(400, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        lblImagen = new JLabel("Sin imagen");
        lblImagen.setBounds(120, 20, 150, 150);
        panel.add(lblImagen);

        txtDetalles = new JTextArea();
        txtDetalles.setEditable(false);
        JScrollPane scroll = new JScrollPane(txtDetalles);
        scroll.setBounds(50, 190, 300, 230);
        panel.add(scroll);

        add(panel);
    }

    private void cargarDetallesPieza() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = getConnection();
            ps = con.prepareStatement(
                "SELECT p.idpieza, p.nombre, p.descubridor, p.fechaing, p.valormon, p.imagen, " +
                "r.descripcion, r.era, r.tipo, r.zonaOrigen " +
                "FROM pieza p INNER JOIN reliquia r ON p.idpieza = r.pieza_idpieza " +
                "WHERE p.idpieza = ?"
            );
            ps.setInt(1, idPieza);
            rs = ps.executeQuery();

            if (rs.next()) {
                StringBuilder sb = new StringBuilder();
                sb.append("🧩 Nombre: ").append(rs.getString("nombre")).append("\n");
                sb.append("👩‍🔬 Descubridor: ").append(rs.getString("descubridor")).append("\n");
                sb.append("📅 Fecha ingreso: ").append(rs.getString("fechaing")).append("\n");
                sb.append("💰 Valor monetario: $").append(rs.getDouble("valormon")).append("\n");
                sb.append("\n=== Datos de Reliquia ===\n");
                sb.append("Descripcion: ").append(rs.getString("descripcion")).append("\n");
                sb.append("Era: ").append(rs.getString("era")).append("\n");
                sb.append("Tipo: ").append(rs.getString("tipo")).append("\n");
                sb.append("Zona de origen: ").append(rs.getString("zonaOrigen")).append("\n");

                txtDetalles.setText(sb.toString());

                // Mostrar la imagen (si existe en la BD)
                Blob blob = rs.getBlob("imagen");
                if (blob != null) {
                    byte[] bytes = blob.getBytes(1, (int) blob.length());
                    ImageIcon icon = new ImageIcon(bytes);
                    Image img = icon.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH);
                    lblImagen.setIcon(new ImageIcon(img));
                    lblImagen.setText("");
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar los detalles: " + e.getMessage());
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private Connection getConnection() {
        Connection con = null;
        String base = "museotitilv";
        String url = "jdbc:mysql://localhost:3306/" + base;
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Error en la conexión: " + e.getMessage());
        }
        return con;
    }
}