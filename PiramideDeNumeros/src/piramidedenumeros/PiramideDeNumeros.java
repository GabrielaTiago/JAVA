package piramidedenumeros;

import java.util.Scanner;

public class PiramideDeNumeros {
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner value1 = new Scanner(System.in);
        Scanner value2 = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        num1 = value1.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = value2.nextInt();

        System.out.println("\n" + "Iterações" + "\n");

        for (int i = num1; i <= num2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.print("\n");
        }

        value1.close();
        value2.close();
    }
}
