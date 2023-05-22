import java.util.Scanner;
import java.lang.Math;
/*
Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, 
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme 
exemplo.
 */
public class RepeticaoFor_Exercicio7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {

            int numero = i;
            int resultado_quadrado = i * i;
            int resultado_cubo = i * i * i;
            System.out.printf("%d %d %d \n", numero, resultado_quadrado, resultado_cubo);
        }

        sc.close();
    }
}