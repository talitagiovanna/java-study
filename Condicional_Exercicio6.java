import java.util.Locale;
import java.util.Scanner;

public class Condicional_Exercicio6 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor");
        double valor = sc.nextDouble();

        if (valor < 0 || valor > 100) {
            System.out.println("Fora de intervalo");
        }
        else if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalor [0, 25]");
        }
        else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25, 50]");
        }
        else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50, 75]");
        }
        else {
            System.out.println("Intervao (75, 100]");
        }
        sc.close();
    }
}