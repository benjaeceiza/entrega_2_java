import java.sql.Date;

public class Personal extends Persona implements MiembroUniversidad {
    
    private String departamento;
    private String puesto;
    private Date fechaIngreso;

    public Personal(String nombre,String apellido, int edad, String documento, String departamento, String puesto, Date fechaIngreso){
        super(nombre, apellido, edad, documento);
        this.departamento = departamento;
        this.puesto = puesto;
        this.fechaIngreso = fechaIngreso;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPuesto() {
        return puesto;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }


     @Override
    public String toString() {

        return "Personal - Nombre: " + getNombre() + " - Apellido: " + getApellido() + " - Documento: " + getDocumento();
    }

    
    @Override
    public void obtenerRol() {

        System.out.println("Personal");
    }

    @Override
    public void obtenerInformacionCompleta() {
        System.out.println("Personal - Nombre: " + getNombre() + " - Apellido: " + getApellido() + " - Documento: "
                + getDocumento() + " - Puesto: "+getPuesto() );


    }
}
