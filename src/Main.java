import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int opcion;
        Scanner leer = new Scanner(System.in);
        double saldo = 1500.0;


        do {

            System.out.println("""
                    ¿Que operacion desea realizar?
                    ------------------------------
                    1- Consultar saldo
                    2- Extraer dinero
                    3- Depositar dinero
                    4- Salir
                    ------------------------------
                    """);
            opcion = leer.nextInt();


            switch (opcion){
                case 1:
                    System.out.println("Su saldo es: " + saldo);
                    break;

                case 2:
                    System.out.println("¿Cuanto dinero desea extraer?");
                    double extraer = leer.nextDouble();
                    if (saldo - extraer > 0 ) {
                        saldo -= extraer;
                        System.out.println("operacion realizada. Su saldo actual es de: " + saldo);
                    }else{
                        System.out.println("No se pudo realizar la operacion, saldo insuficiente");
                    }
                    break;

                case 3:
                    System.out.println("¿Cuanto dinero desea depositar?");
                    double depositar = leer.nextDouble();
                    saldo += depositar;
                    System.out.println("operacion realizada. Su saldo actual es de: " + saldo);
                    break;


            }

        } while (opcion != 4);

        System.out.println("Gracias por utilizar nuestros servicios");

    }
}