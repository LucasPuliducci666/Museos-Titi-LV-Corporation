package persistencia;

public class pieza {
    
    public int id;
    public String nombre;
    public String fechaing;
    public String descubridor;
    public double valormon;
    public char seccion;
    
    public pieza (int id, String nombre, String fechaing, String descubridor, double valormon, char seccion){
    
    this.id=id;
    this.nombre=nombre;
    this.fechaing=fechaing;
    this.descubridor=descubridor;
    this.valormon=valormon;
    this.seccion=seccion;
    
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFechaing() {
        return fechaing;
    }

    public void setFechaing(String fechaing) {
        this.fechaing = fechaing;
    }

    public String getDescubridor() {
        return descubridor;
    }

    public void setDescubridor(String descubridor) {
        this.descubridor = descubridor;
    }

    public double getValormon() {
        return valormon;
    }

    public void setValormon(double valormon) {
        this.valormon = valormon;
    }

    public char getSeccion() {
        return seccion;
    }

    public void setSeccion(char seccion) {
        this.seccion = seccion;
    }
    
}
