package multiplicaai;

import java.util.Scanner;

public class MultiplicaAi {
    public static void main(String[] args) {
        int multiplying;
        int multiplier = 10;
        int product;

        Scanner value = new Scanner(System.in);
        
        System.out.println("Digite o número que será multiplicado: ");
        multiplying = value.nextInt();
        value.close();

        System.out.println("Tabela de multiplicação de " + multiplying);

        for (int i = 0; i <= multiplier; i++) {
            product = (multiplying * i);
            System.out.println(multiplying + "x" + i + " = " + product);
        }

    }
}
