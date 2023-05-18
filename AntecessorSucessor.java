import java.util.Scanner;

public class AntecessorSucessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int ante = numero - 1;
        int suce = numero + 1;
        System.out.println("Antecessor: " + ante);
        System.out.println("Sucessor: " + suce);
        scanner.close();
    }
}
