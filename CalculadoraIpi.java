// Exercicio04

import java.util.Scanner;

public class CalculadoraIpi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido (sem %): ");
        double ipi = 0;

        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um valor numérico para o IPI: ");
            scanner.next(); // Descartar entrada inválida
        }
        ipi = scanner.nextDouble();

        System.out.println("Digite os dados da peça 1:");
        System.out.print("Código: ");
        int codigo1 = 0;

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um valor inteiro para o código: ");
            scanner.next(); // Descartar entrada inválida
        }
        codigo1 = scanner.nextInt();

        System.out.print("Valor unitário: ");
        double valor1 = 0;

        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um valor numérico para o valor unitário: ");
            scanner.next(); // Descartar entrada inválida
        }
        valor1 = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade1 = 0;

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um valor inteiro para a quantidade: ");
            scanner.next(); // Descartar entrada inválida
        }
        quantidade1 = scanner.nextInt();

        System.out.println("Digite os dados da peça 2:");
        System.out.print("Código: ");
        int codigo2 = 0;

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um valor inteiro para o código: ");
            scanner.next(); // Descartar entrada inválida
        }
        codigo2 = scanner.nextInt();

        System.out.print("Valor unitário: ");
        double valor2 = 0;

        while (!scanner.hasNextDouble()) {
            System.out.println("Entrada inválida. Digite um valor numérico para o valor unitário: ");
            scanner.next(); // Descartar entrada inválida
        }
        valor2 = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade2 = 0;

        while (!scanner.hasNextInt()) {
            System.out.println("Entrada inválida. Digite um valor inteiro para a quantidade: ");
            scanner.next(); // Descartar entrada inválida
        }
        quantidade2 = scanner.nextInt();

        scanner.close();

        double valorTotal = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);

        System.out.printf("O valor total a ser pago é: %.2f", valorTotal);
    }
}
