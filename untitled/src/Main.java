import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    double moneda=0.0;
    double monedaConversion=0.0;
    Scanner lectura = new Scanner(System.in);


    int menu=0, opcion;


    while(menu==0){

        System.out.println("-----------------------JEO CONVERSOR DE MONEDAS-------------------------");
        System.out.println("\n1- Dólar            --->Peso Argentino");
        System.out.println("2- Peso Argentino   ---> Dólar");
        System.out.println("3- Dolar            ---> Real brasileño");
        System.out.println("4- Real brasileño   ---> Dolar");
        System.out.println("5- Dolar            ---> Peso Colombiano");
        System.out.println("6- Peso Colombiano  ---> Dolar");
        System.out.println("9- SALIR DE CONVERSOR");
        System.out.print("-> ");
        opcion= lectura.nextInt();

        switch(opcion){

            case 1:
                System.out.println("DÓLAR A PESO ARGERTINO--------------");
                System.out.println("ingrese cantidad de dólares a convertir: ");
                moneda = lectura.nextDouble();
                while(moneda < 0 ) { // Mientras ingrese valor negativo, vuelve a pedir ingreso correcto

                    System.out.println("Incorrecto! por favor ingrese valor mayor a cero");
                    moneda = lectura.nextDouble();

                }
                System.out.println(); //retorno funcion que realiza la conversion
            break;

            case 2:
                System.out.println("DÓLAR A PESO ARGERTINO--------------");
                System.out.println("ingrese cantidad de pesos argentinos a convertir: ");
                moneda = lectura.nextDouble();
                while(moneda < 0 ) { // Mientras ingrese valor negativo, vuelve a pedir ingreso correcto

                    System.out.println("Incorrecto! por favor ingrese valor mayor a cero");
                    moneda = lectura.nextDouble();

                }
                System.out.println(); //retorno funcion que realiza la conversion

            break;

        }





    }

    }
}