import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class CalculadoraIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia de nascimento:");
        int dia = scanner.nextInt();
        System.out.print("Digite o mes de nascimento:");
        int mes = scanner.nextInt();
        System.out.print("Digite o ano de nascimento(4 digitos):");
        int ano = scanner.nextInt();
        scanner.close();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();

        Period idade = Period.between(dataNascimento, dataAtual);
        long totalDias = ChronoUnit.DAYS.between(dataNascimento, dataAtual);

        System.out.printf("Você nasceu em %d/%d/%d.%n ", dia, mes, ano);
        System.out.printf("Sua idade é: %d anos, %d meses e %d dias%n", idade.getYears(), idade.getMonths(), idade.getDays());
        System.out.printf("Você tem %d dias de idade", totalDias);



    }

}