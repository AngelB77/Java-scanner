import java.util.Scanner;

public class SignUp {
    public static void main(String[] args) {

        //Vamos a crear un formulario de registro
        Scanner scanner= new Scanner(System.in);

        //Los datos que debes pedir al usuario son:
        //1. Nombre
        System.out.println("Nombre:");
        String Nombre = scanner.nextLine();
        //2. Apellido
        System.out.println("Apellido:");
        String Apellido = scanner.nextLine();
        //3. Nombre de usuario
        System.out.println("Nombre de usuario:");
        String usuario = scanner.nextLine();
        //4. Contraseña
        System.out.println("Contraseña:");
        String Contraseña = scanner.nextLine();
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        System.out.println();
        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
        System.out.println("Hola " + Nombre + " " + Apellido + ", tu nombre de usuario es " + usuario
                + " y tu contraseña es " + Contraseña + ", gracias por registrarte.");
    }
}