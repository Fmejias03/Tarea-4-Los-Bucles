import java.util.Scanner;

public class Ejercicio5 {

    //Esta vez, el ordenador debe adivinar un número elegido por el usuario. El usuario le indica si el número es mayor (+), menor (-) o si lo ha encontrado (=).
    //
    //Ejemplo de ejecución del algoritmo:
    //
    //Elija un número del 1 al 100, luego presione cualquier tecla.
    //
    //a
    //
    //Pruebo con 45, ¿es mayor, menor o es el número (+/-/=)?
    //
    //-
    //
    //Pruebo con 10, ¿es mayor, menor o es el número (+/-/=)?
    //
    //+
    //
    //Pruebo con 22, ¿es mayor, menor o es el número (+/-/=)?
    //
    //+
    //
    //Pruebo con 27, ¿es mayor, menor o es el número (+/-/=)?
    //
    //=
    //
    //Fenomenal, lo he encontrado después de 4 intentos.

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int numero, aleatorio, intentos;
        char respuesta;
        Scanner teclado = new Scanner(System.in);
        aleatorio = (int) (Math.random() * 100) + 1;
        System.out.println("Elija un número del 1 al 100, luego presione cualquier tecla.");
        teclado.next();
        System.out.println("Pruebo con " + aleatorio + ", ¿es mayor, menor o es el número (+/-/=)?");
        respuesta = teclado.next().charAt(0);
        intentos = 1;
        while (respuesta != '=') {
            if (respuesta == '+') {
                aleatorio = (int) (Math.random() * (100 - aleatorio)) + aleatorio + 1;
            } else {
                aleatorio = (int) (Math.random() * (aleatorio - 1)) + 1;
            }
            System.out.println("Pruebo con " + aleatorio + ", ¿es mayor, menor o es el número (+/-/=)?");
            respuesta = teclado.next().charAt(0);
            intentos = intentos + 1;
        }
        System.out.println("Fenomenal, lo he encontrado después de " + intentos + " intentos.");
    }


}
