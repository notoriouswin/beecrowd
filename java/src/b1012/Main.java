package b1012;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        int maiorAB = ((a + b) + Math.abs(a - b)) / 2;
        int maior = ((maiorAB + c) + Math.abs(maiorAB - c)) / 2;
        System.out.println(maior);
    }
}
