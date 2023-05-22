import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Reajuste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um valor");
        double atual = Float.parseFloat(scanner.nextLine());
        double reajuste = atual + ((atual * 1)/100);
        System.out.printf("O valor de R$ %.2f, com reajuste será de:R$ %.2f ", atual, reajuste);


    }
}