import java.util.Scanner;
import java.util.Locale;

public class Aula8 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Insira as medidas do triângulo X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();
        System.out.println("Insira as medidas do triângulo Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p* (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p* (p - yA) * (p - yB) * (p - yC));

        System.out.printf("A área do triângulo X: %4f%n", areaX);
        System.out.printf("A área do triângulo Y: %4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("A maior área é: X");
        }
        else {
            System.out.println("A maior área é: Y");
        }


        sc.close();
    }
}

