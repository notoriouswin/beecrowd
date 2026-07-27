package b1011;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final double NUMERO_DE_PI = 3.14159;
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        double volume = (4d / 3d)  * NUMERO_DE_PI * Math.pow(raio,3);

        System.out.printf("VOLUME = %.3f%n",volume);
    }
}
