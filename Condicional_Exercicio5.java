import java.util.Locale;
import java.util.Scanner;

public class Condicional_Exercicio5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double preco = 0.f;

        System.out.println("Digite o código do item: ");
        int codigo = sc.nextInt();

        System.out.println("Digite a quantidade deste item: ");
        int quantidade = sc.nextInt();

        if (codigo == 1) {
            preco = quantidade * 4.00;
        }
        else if (codigo == 2) {
            preco = quantidade * 4.50;
        }
        else if (codigo == 3) {
            preco = quantidade * 5.00;
        }
        else if (codigo == 4) {
            preco = quantidade * 2.00;
        }
        else if (codigo == 5) {
            preco = quantidade * 1.50;
        }
        else {
            System.out.println("Esse código não existe!");
        }
        System.out.printf("Total: %.2f%n", preco);
    sc.close();  
    }
}