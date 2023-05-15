import java.util.Locale;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num, horas;
        double valor, salario;

        num = sc.nextInt();
        horas = sc.nextInt();
        valor = sc.nextDouble();

        salario = horas * valor;

        System.out.println("NÚMERO = " + num);
        System.out.printf("SALARIO = %.2f%n", salario);

        sc.close();

    }
}