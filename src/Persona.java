public class Persona {
  private String nombre;
  private String apellido;
  private int edad;
  private String documento;

  public Persona(String nombre,String apellido, int edad, String documento){
    
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.documento = documento;

  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public void setApellido(String apellido) {
      this.apellido = apellido;
  }

  public void setEdad(int edad) {
      this.edad = edad;
  }

  public void setDocumento(String documento) {
      this.documento = documento;
  }

  public String getNombre() {
      return nombre;
  }

  public String getApellido() {
      return apellido;
  }

  public int getEdad() {
      return edad;
  }

  public String getDocumento() {
      return documento;
  }

   
  @Override
  public String toString(){
       
    return "Nombre: "+getNombre()+" - Apellido: "+getApellido()+" - Documento: "+getDocumento();
  }
     
}