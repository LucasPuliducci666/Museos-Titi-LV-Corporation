
package persistencia;

public class reliquia extends pieza{
    public String descripcion;
    public String zonaOrigen;
    public String era;
    public String tipo;
    
    public reliquia (int id, String nombre, String fechaing, String descubridor, double valormon, char seccion, String descripcion, String zonaOrigen, String era, String tipo){
        super(id, nombre, fechaing, descubridor, valormon, seccion);    
        this.descripcion=descripcion;
        this.zonaOrigen=zonaOrigen;
        this.era=era;
        this.tipo=tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getZonaOrigen() {
        return zonaOrigen;
    }

    public void setZonaOrigen(String zonaOrigen) {
        this.zonaOrigen = zonaOrigen;
    }

    public String getEra() {
        return era;
    }

    public void setEra(String era) {
        this.era = era;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
