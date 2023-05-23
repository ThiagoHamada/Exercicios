//Exercicio01

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite a quantidade de anos: ");
            int anos = scanner.nextInt();

            System.out.print("Digite a quantidade de meses: ");
            int meses = scanner.nextInt();

            System.out.print("Digite a quantidade de dias: ");
            int dias = scanner.nextInt();

            int totalDias = (anos * 365) + (meses * 30) + dias;

            System.out.println("A idade em dias é: " + totalDias + " dias");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Certifique-se de digitar apenas números inteiros.");
        }

        scanner.close();
    }
}
