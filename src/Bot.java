import java.util.Scanner;

public class Bot {
    public static void main(String[] args) {
        //Crea el scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola, ¿Cómo te llamas?");

        //Recoge el dato
        String nombre = scanner.nextLine();
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("\nHola "+nombre+"!,Soy un Bot. ¿De qué ciudad eres?");

        //Recoge el dato
        String ciudad = scanner.nextLine();
        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("\nHe escuchado que "+ciudad+" es un encanto. Yo nací en Oracle city.");
        System.out.println("¿Cuántos años tienes?");

        //Recoge el dato
        int años = scanner.nextInt();

        //Añade una nueva línea antes de mostrar la siguiente pregunta.

        System.out.println("\nEntonces me dices que tienes "+años+" años. Yo tengo 400 años.");
        System.out.println("Eso quiere decir que soy "+(400 / años)+" veces más vieja que tu.");
        System.out.println("Basta de hablar de mi misma. ¿Cuál es tu lenguaje de programación favorito? (Por favor no digas Python)");

        //Recoge el dato
        String lenguajeDeProgramación = scanner.next();
        //Añade una nueva línea.
        System.out.println("\n"+lenguajeDeProgramación+",¡Eso es excelente! Mucho gusto haber hablado contigo "+nombre+", ¡Hablamos luego!");

        //¿Te acordaste del nextLine trap?
        //Recuerda cerrar el scanner

    }
}
