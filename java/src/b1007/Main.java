package b1007;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();

        int DIFERENCA = (A * B) - (C * D);

        System.out.printf("DIFERENCA = %d%n",DIFERENCA);
    }
}
