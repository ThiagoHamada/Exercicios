//Exercicio03

import java.util.Scanner;

public class Reajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor");
        double atual = 0;

        while (!scanner.hasNextFloat()) {
            System.out.println("Entrada inválida. Digite um valor numérico:");
            scanner.next();
        }
        atual = scanner.nextFloat();

        double reajuste = atual + ((atual * 1)/100);
        System.out.printf("O valor de R$ %.2f, com reajuste será de:R$ %.2f ", atual, reajuste);


    }
}