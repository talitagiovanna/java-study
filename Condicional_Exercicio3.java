import java.util.Scanner;

public class Condicional_Exercicio3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        int aux;

        System.out.println("Digite um número (ordem crescente):");
        num = sc.nextInt();
        System.out.println("Digite um número (ordem crescente):");
        num2 = sc.nextInt();

        if (num > num2) {
            aux = num2;
            num2 = num;
            num = aux;
        }

        if (num2 % num == 0) {
            System.out.println("São Múltiplos");
        }
        else {
            System.out.println("Não são Múltiplos");
        }
        sc.close();
    }
    
}