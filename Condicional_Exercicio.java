import java.util.Scanner;

public class Condicional_Exercicio {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Digite um número:");
        num = sc.nextInt();

        if (num < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NÃO NEGATIVO");
        }
        sc.close();
    }
}