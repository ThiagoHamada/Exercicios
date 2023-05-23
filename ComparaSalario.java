//Exercicio05

import java.util.Scanner;

public class ComparaSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salmini = 788;
        System.out.print("Digite o valor do seu salário: ");
        float saluser = 0;

        while (!scanner.hasNextFloat()) {
            System.out.println("Entrada inválida. Digite um valor numérico para o salário: ");
            scanner.next(); // Descartar entrada inválida
        }
        saluser = scanner.nextFloat();

        if (saluser < 0) {
            saluser = 0; // Atribuir zero se o salário for negativo
        }

        float quantsalamin = saluser / salmini;

        System.out.printf("Você recebe o equivalente a %.2f salários mínimos.%n", quantsalamin);

        scanner.close();
    }
}
