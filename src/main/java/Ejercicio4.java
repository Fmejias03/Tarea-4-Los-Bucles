import java.util.Scanner;

public class Ejercicio4 {
    //Su algoritmo debe generar un número entero aleatorio entre 1 y 100. El usuario tiene que encontrar este número. Con cada intento del usuario, se le debe indicar si el número es mayor, menor o igual al valor introducido. El programa finaliza cuando el usuario ha encontrado el número.
    //
    //Ejemplo de ejecución del algoritmo:
    //
    //¿En qué número entre 1 y 100 estoy pensando?
    //
    //23
    //
    //Menor
    //
    //15
    //
    //Mayor
    //
    //19
    //
    //Menor
    //
    //17
    //
    //Bravo, lo ha encontrado

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int numero, aleatorio;
        Scanner teclado = new Scanner(System.in);
        aleatorio = (int) (Math.random() * 100) + 1;
        System.out.println("¿En qué número entre 1 y 100 estoy pensando?");
        numero = teclado.nextInt();
        while (numero != aleatorio) {
            if (numero > aleatorio) {
                System.out.println("Menor");
            } else {
                System.out.println("Mayor");
            }
            System.out.println("¿En qué número entre 1 y 100 estoy pensando?");
            numero = teclado.nextInt();
        }
        System.out.println("Bravo, lo ha encontrado");
    }
}
