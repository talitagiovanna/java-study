import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, codigo2, peca1, peca2;
        double valor1, valor2, pagamento;

        codigo1 = sc.nextInt();
        peca1 = sc.nextInt();
        valor1 = sc.nextDouble();
        codigo2 = sc.nextInt();
        peca2 = sc.nextInt();
        valor2 = sc.nextDouble();

        pagamento = (peca1 * valor1) + (peca2 * valor2);

        System.out.printf("VALOR A PAGAR = %.2f%n", pagamento);

        sc.close();

    }
}
