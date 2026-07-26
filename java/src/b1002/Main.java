package b1002;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static final double NUMERO_DE_PI = 3.14159;

    public static void main(String[] args){
        Locale.setDefault(new Locale("en","US"));
        Scanner scan = new Scanner(System.in);
        double raio = scan.nextDouble();
        double area = NUMERO_DE_PI * Math.pow(raio,2);
        System.out.printf("A=%.4f%n",area);
    }
}
