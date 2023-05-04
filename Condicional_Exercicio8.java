import java.util.Locale;
import java.util.Scanner;

public class Condicional_Exercicio8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor = 0.2f;
        double impostoRenda = 0.2f;

        System.out.println("Digite o seu salário: ");
        valor = sc.nextDouble();

        if (valor >= 0.00 && valor <= 2000.00) {
            System.out.println("Isento");
        }
        else if (valor >= 2000.01 && valor <= 3000.00) {
            impostoRenda = (valor - 2000.00) * 0.08;
            System.out.println("R$ " + impostoRenda);
        }
        else if (valor >= 3000.01 && valor <= 4500.00) {
            impostoRenda = (valor - 3000) * 0.18 + 1000.00 * 0.08;
            System.out.println("R$ " + impostoRenda);
        }
        else {
            impostoRenda = (valor - 4500)* 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
            System.out.printf("R$ %.2f%n", impostoRenda);
        }
        sc.close();
    }
}
