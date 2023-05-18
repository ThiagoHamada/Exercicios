import java.util.Scanner;

public class CalculadoraIpi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a porcentagem do IPI a ser acrescido(sem %): ");
        double ipi = scanner.nextDouble();

        System.out.println("Digite os dados da peça 1:");
        System.out.print("Código: ");
        int codigo1 = scanner.nextInt();
        System.out.print("Valor unitário: ");
        double valor1 = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade1 = scanner.nextInt();

        System.out.println("Digite os dados da peça 2:");
        System.out.print("Código: ");
        int codigo2 = scanner.nextInt();
        System.out.print("Valor unitário: ");
        double valor2 = scanner.nextDouble();
        System.out.print("Quantidade: ");
        int quantidade2 = scanner.nextInt();

        scanner.close();

        double valorTotal = (valor1 * quantidade1 + valor2 * quantidade2) * (ipi / 100 + 1);

        System.out.printf("O valor total a ser pago é: %.2f", valorTotal);
    }
}
