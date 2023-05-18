import java.util.Scanner;

public class ComparaSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float salmini = 788;
        System.out.print("Digite o valor do seu salário : ");
        float saluser = scanner.nextFloat();

        float quantsalamin = saluser / salmini;

        System.out.printf("Você recebe o equivalente a  %.2f salários mínimos.%n", quantsalamin);

        scanner.close();
    }
}
