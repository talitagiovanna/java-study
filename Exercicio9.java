import java.util.Locale;
import java.util.Scanner;


public class Exercicio9 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double area, raio, pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = pi * (raio * raio);
		
		System.out.printf("A = %.4f%n", area);
		
		sc.close();
		
	}

}
