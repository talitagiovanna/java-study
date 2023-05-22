import java.util.Scanner;
/*
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
 */
public class RepeticaoFor_Exercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial = fatorial * i;
        }

        System.out.println(fatorial);

        sc.close();
        
    }
}