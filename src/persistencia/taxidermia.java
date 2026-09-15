
package persistencia;

public class taxidermia extends pieza{
    public String familia;
    public String especie;
    public String edad;
    public String periodo;
    public String ambiente;
    
    public taxidermia (int id, String nombre, String fechaing, String descubridor, double valormon, char seccion, String familia,String especie, String edad, String periodo, String ambiente){
        super(id, nombre, fechaing, descubridor, valormon, seccion);    
        this.familia=familia;
        this.especie=especie;
        this.edad=edad;
        this.periodo=periodo;
        this.ambiente=ambiente;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
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