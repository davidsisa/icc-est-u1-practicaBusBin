import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //
        //personas[0] = new Personas (nombre,edad);
       Scanner leer = new Scanner (System.in);
       OrdenarBusqueda ordenarybuscar = new OrdenarBusqueda();
       System.out.println(" INGRESE LA CANTIDAD DE PERSONAS QUE QUIERE REGISTRAR: ");
       int tamanio = leer.nextInt();
       leer.nextLine();
       Persona[] personas = new Persona[tamanio];
       for (int i = 0; i < tamanio; i++) {
           System.out.println("Ingresa el nombre de la persona " + i + ":");     
            String nombre = leer.nextLine();
            System.out.println("Ingrese la edad de la persona " + i + ":");
            int edad = leer.nextInt();
            leer.nextLine();
            personas[i] = new Persona(nombre,edad);
            
        }

        personas = ordenarybuscar.ordenarLista(personas);
        System.out.println("------------LISTA DE USUARIOS---------");
        for (Persona persona : personas) {
            System.out.println(persona.toString());
        }
        System.out.println("Ingresa un numero que quieras buscar dentro de la lista:  ");
        int buscar = leer.nextInt();
        leer.nextLine();
        Persona encontrar = ordenarybuscar.buscarUsuario(personas,buscar);
        if (encontrar != null) {
            System.out.println("Persona encontrada: " + encontrar.toString());
        }  
    }  
}
