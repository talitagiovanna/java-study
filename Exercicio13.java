import java.util.Locale;
import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, pi = 3.14159;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();


        double areaTriangulo = (A * C) / 2;
        double areaCirculo = pi * (C * C);
        double areaTrapezio = ((A + B) * C) / 2;
        double areaQuadrado = (B * B);
        double areaRetangulo = (A * B);
        
        System.out.printf("TRIÂNGULO = %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO = %.3f%n", areaCirculo);
        System.out.printf("TRAPÉZIO = %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO = %.3f%n", areaQuadrado);
        System.out.printf("RETÂNGULO = %.3f%n", areaRetangulo);

        sc.close();

    }
}