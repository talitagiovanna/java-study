import java.util.Locale;
import java.util.Scanner;

/*public class Aula {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String x;
        x = sc.next();
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}*/

/*public class Aula {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}*/

/*public class Aula {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x;
        x = sc.nextDouble();
        System.out.printf("Você digitou: %.2f%n", x);

        sc.close();
    }
}*/

/*public class Aula {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char x;
        x = sc.next().charAt(0);
        System.out.println("Você digitou: " + x);

        sc.close();
    }
}*/

public class Aula {

    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}