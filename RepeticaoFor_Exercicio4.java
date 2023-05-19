import java.util.Locale;
import java.util.Scanner;
/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo 
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
 */
public class RepeticaoFor_Exercicio4 {
    
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            int num_1 = sc.nextInt();
            int num_2 = sc.nextInt();

            if (num_2 == 0) {
                System.out.println("divisão impossível");

            }
            else {
                double divisao = (double) num_1 / num_2;
                System.out.printf("%.1f%n", divisao);
            }
 
        }

        sc.close();
    }
}