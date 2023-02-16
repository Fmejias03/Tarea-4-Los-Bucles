import java.util.Scanner;

public class Ejercicio7 {
    //Ejercicio 7 V1

    //El programa debe mostrar un menú con una lista de películas y una opción para salir.
    //
    //Si el usuario elige una de las películas, el programa mostrará una cita de esa película. Luego, el usuario puede elegir otra película o salir.
    //
    //Si el usuario elige salir, el programa mostrará un mensaje antes de salir.
    //
    //Ejemplo de ejecución:
    //
    //1 - Una cita de la ciudad del miedo
    //
    //2 - Una cita de James Bond
    //
    //3 - Una cita de la vida es un largo río tranquilo
    //
    //4 - Una cita de Star Wars
    //
    //5 - Salir de esta magnífica aplicación
    //
    //2
    //
    //Me llamo Bond, James Bond
    //
    //1
    //
    //Cuidado, es una auténtica carnicería
    //
    //5
    //
    //Adios
    //
    //¡Por supuesto, puede elegir las películas y las citas que prefiera!

    /*public static void main(String[] args) {
        // TODO Auto-generated method stub
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 - Una cita de la ciudad del miedo");
        System.out.println("2 - Una cita de James Bond");
        System.out.println("3 - Una cita de la vida es un largo río tranquilo");
        System.out.println("4 - Una cita de Star Wars");
        System.out.println("5 - Salir de esta magnífica aplicación");
        opcion = teclado.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    System.out.println("Cuidado, es una auténtica carnicería");
                    break;
                case 2:
                    System.out.println("Me llamo Bond, James Bond");
                    break;
                case 3:
                    System.out.println("¿Qué es lo que quieres que te diga?");
                    break;
                case 4:
                    System.out.println("Yo soy tu padre");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo río tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = teclado.nextInt();
        }
        System.out.println("Adios");
    }*/



    //Ejercicio 7 V2

    //Retomar el algoritmo anterior, modificándolo para que no se muestre siempre la misma cita de una película, sino que haya dos o tres y presente aleatoriamente una de ellas.

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int opcion;
        Scanner teclado = new Scanner(System.in);
        System.out.println("1 - Una cita de la ciudad del miedo");
        System.out.println("2 - Una cita de James Bond");
        System.out.println("3 - Una cita de la vida es un largo río tranquilo");
        System.out.println("4 - Una cita de Star Wars");
        System.out.println("5 - Salir de esta magnífica aplicación");
        opcion = teclado.nextInt();
        while (opcion != 5) {
            switch (opcion) {
                case 1:
                    int aleatorio1 = (int) (Math.random() * 3) + 1;
                    switch (aleatorio1) {
                        case 1:
                            System.out.println("Cuidado, es una auténtica carnicería");
                            break;
                        case 2:
                            System.out.println("Lo peor de los miedos es que te hace prisionero y te impide hacer lo que quieres");
                            break;
                        case 3:
                            System.out.println("La gente teme lo que no comprende");
                            break;
                    }
                    break;
                case 2:
                    int aleatorio2 = (int) (Math.random() * 3) + 1;
                    switch (aleatorio2) {
                        case 1:
                            System.out.println("Me llamo Bond, James Bond");
                            break;
                        case 2:
                            System.out.println("Agitado, no revuelto");
                            break;
                        case 3:
                            System.out.println("Las cosas que hago por mi país");
                            break;
                    }
                    break;
                case 3:
                    int aleatorio3 = (int) (Math.random() * 3) + 1;
                    switch (aleatorio3) {
                        case 1:
                            System.out.println("¿Qué es lo que quieres que te diga?");
                            break;
                        case 2:
                            System.out.println("La vida es un largo río tranquilo, Agnès. A veces hay rápidos, a veces hay curvas, pero al final, todo fluye hacia el mismo lugar");
                            break;
                        case 3:
                            System.out.println("Es sorprendente cómo el dinero puede encontrar un camino, incluso a través de la naturaleza más retorcida");
                            break;
                    }
                    break;
                case 4:
                    int aleatorio4 = (int) (Math.random() * 3) + 1;
                    switch (aleatorio4) {
                        case 1:
                            System.out.println("Yo soy tu padre");
                            break;
                        case 2:
                            System.out.println("Que la Fuerza te acompañe");
                            break;
                        case 3:
                            System.out.println("No intentes. Hazlo o no lo hagas, pero no lo intentes");
                            break;
                    }
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
            System.out.println("1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de la vida es un largo río tranquilo");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = teclado.nextInt();
        }
        System.out.println("Adios");

    }
}
