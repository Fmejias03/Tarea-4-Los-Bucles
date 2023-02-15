import java.util.Scanner;

public class Ejercicio6 {

    //Observe atentamente el siguiente algoritmo:
    //
    //Algo Trampa
    //Variable numIntento : entero <- 1
    //Variable valorIntroducido : texto
    //Constante MAX_INTENTOS : entero <- 5
    //Inicio
    //   valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
    //   MientrasQue valorIntroducido ≠ "París" o MAX_INTENTOS - numIntentos ≠ 0
    //         escribir("Respuesta incorrecta")
    //         escribir("Solo quedan " & MAX_INTENTOS - numIntentos &
    //" intento(s)")
    //         valorIntroducido <- introducir("¿Cuál es la capital de Francia? ")
    //   FMq
    //   Si MAX_INTENTOS - numIntento ≠ 0 Entonces
    //         escribir("Bravo")
    //   Si no
    //         escribir("Revise sus conocimientos en geografía")
    //   FSi
    //Fin
    //¿Qué hace?
    //
    //Corrija este algoritmo para que logre lo que se podría esperar.



    //Este codigo pide al usuario la capital de Francia, si no es la correcta, el usuario tendría otros 3 intentos para adivinarla, si no lo consigue, se le dirá que revise sus conocimientos en geografía. Si acierta la capital, se imprime bravo.
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int numIntento = 1;
        String valorIntroducido;
        Scanner teclado = new Scanner(System.in);
        final int MAX_INTENTOS = 5;
        System.out.println("¿Cuál es la capital de Francia? ");
        valorIntroducido = teclado.nextLine();
        while (!(valorIntroducido.equals("París") || valorIntroducido.equals("parís") || valorIntroducido.equals("Paris") || valorIntroducido.equals("paris")) && MAX_INTENTOS - numIntento != 0) {
            System.out.println("Respuesta incorrecta");
            System.out.println("Solo quedan " + (MAX_INTENTOS - numIntento) + " intento(s)");
            System.out.println("¿Cuál es la capital de Francia? ");
            valorIntroducido = teclado.nextLine();
            numIntento++;
        }
        if (MAX_INTENTOS - numIntento != 0) {
            System.out.println("Bravo");
        } else {
            System.out.println("Revise sus conocimientos en geografía");
        }
    }


}
