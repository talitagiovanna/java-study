import java.util.Locale;

public class Exercicio2 {
	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Mesa de trabalho";
		
		int idade = 30;
		int codigo = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.printf("Produtos:%n%s, com o preço de $ %.2f%n%s, com o preço de $ %.2f%n", produto1, preco1, produto2, preco2);
		System.out.printf("%nRegistro: %d anos de idade, código %d e gênero: %c%n", idade, codigo, genero);
		System.out.printf("Medida com oito casas decimais: %.8f%nArredondado (três casas decimais): %.3f%n", medida, medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos EUA: %.3f", medida);
	}

}
