import java.util.Locale;
import java.util.Scanner;

public class Condicional_Exercicio7 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double ponto1 = 0.0;
        double ponto2 = 0.0;

        System.out.println("Digite um ponto no plano: ");
        ponto1 = sc.nextDouble();
        System.out.println("Digite um ponto no plano: ");
        ponto2 = sc.nextDouble();
        
        if (ponto1 == 0.0 && ponto2 == 0.0) {
            System.out.println("Origem");
        }
        else if (ponto1 == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (ponto2 == 0.0) {
            System.out.println("Eixo X");
        }
        else if (ponto1 > 0.0 && ponto2 > 0.0) {
            System.out.println("Q1");
        }
        else if (ponto1 < 0.0 && ponto2 > 0.0) {
            System.out.println("Q2");
        }
        else if (ponto1 < 0.0 && ponto2 < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc.close();
    }
}