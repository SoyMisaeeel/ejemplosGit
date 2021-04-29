/*
 * Ejercicios GitHub | Practica 2
 * Arturo Misael Alvarez Gutierrez | Nro. Control: 20550369
 */
package ejemplosgit;

import java.util.Scanner;

public class EjemplosGit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa el programa por ejecutar: \n"
                + "1. Sobrecarga de constructores\n"
                + "2. Sobrecarga de metodos");

        int Opcion = sc.nextInt();
        switch (Opcion) {
            case 1:
                Caja c1 = new Caja(10, 20, 15);
                Caja c2 = new Caja();
                Caja c3 = new Caja(5);
                System.out.println("Caja 1: " + c1);
                System.out.println("Caja 2: " + c2);
                System.out.println("Caja 3: " + c3);
                break;
            case 2:
                sobrecarga valores = new sobrecarga();
                valores.test();
                valores.test(5);
                valores.test(15, 20);
                double resultado = valores.test(25.93);
                break;
            default:
                break;
        }

    }

}
