public class Persona {
private String nombre, apellidos, afiliacion, condicion;
private int edad;

    public Persona(String nombre, String apellidos, String afiliacion, String condicion, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.afiliacion = afiliacion;
        this.condicion = condicion;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toSting(){
        return nombre +"\n"+ apellidos+"\n" + afiliacion+"\n" + condicion+"\n" + edad+"\n";
    }
    
}
