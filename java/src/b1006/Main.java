package b1006;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double A = scan.nextDouble();
        double B = scan.nextDouble();
        double C = scan.nextDouble();
        double pesoNotasTotal = 2 + 3 + 5;
        double MEDIA = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / pesoNotasTotal;
        System.out.printf("MEDIA = %.1f%n",MEDIA);
    }
}
