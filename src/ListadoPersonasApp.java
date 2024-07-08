import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListadoPersonasApp {

  public static void main(String[] args) {
    Scanner consola = new Scanner(System.in);
    List<Persona> personas = new ArrayList<>();
    boolean salir = false;
    while (!salir) {
      try {
        int opcion = mostrarMenu(consola);
        salir = ejecutarOpciones(opcion, consola, personas);
      } catch (Exception e) {
        System.out.println("Ocurrio un error: " + e.getMessage());
      } finally {
        System.out.println();
      }
    }
  }

  private static int mostrarMenu(Scanner consola) {
    //Mostrar las Opciones
    System.out.print("""
        *** Listado de Personas APP ***
        1. Agregar
        2. Listar
        3. Salir
        Proporciona la ocion:\s""");
    return Integer.parseInt(consola.nextLine());
  }

  private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Persona> personas) {
    boolean salir = false;

    switch (opcion) {
      case 1 -> {
        System.out.print("Proporciona el Nombre: ");
        String nombre = consola.nextLine();
        System.out.print("Proporciona el Telefono: ");
        String tel = consola.nextLine();
        System.out.print("Proporciona el Email: ");
        String email = consola.nextLine();

        Persona persona = new Persona(nombre, tel, email);
        personas.add(persona);
        System.out.println("La lista tiene: " + personas.size() + " elementos.");
      }
      case 2 -> {
        System.out.println("Listado de Personas: ");
        personas.forEach(System.out::println);
      }
      case 3 -> {
        System.out.println("Hasta pronto!!!");
        salir = true;
      }
      default -> System.out.println("Opcion erronea: " + opcion);
    }

    return salir;
  }
}