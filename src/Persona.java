public class Persona {

  private int id;
  private String nombre;
  private String tel;
  private String email;
  private static int numeroPersonas = 0;

  //Contructor vacio
  public Persona() {
    this.id = ++Persona.numeroPersonas;
  }

  public Persona(String nombre, String tel, String email) {
    this(); // Se llama el contructor vacio
    this.nombre = nombre;
    this.tel = tel;
    this.email = email;
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

  public String getTel() {
    return tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString() {
    return "Persona{" +
        "id=" + id +
        ", nombre='" + nombre + '\'' +
        ", tel='" + tel + '\'' +
        ", email='" + email + '\'' +
        '}';
  }

  public void setEmail(String email) {
    this.email = email;
  }
}
