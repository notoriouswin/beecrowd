package b1008;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int NUMERO = scan.nextInt();
        int HORAS = scan.nextInt();
        double SALARIO = scan.nextDouble();


        System.out.printf("NUMBER = %d%nSALARY = U$ %.2f%n",NUMERO,HORAS * SALARIO);
    }
}


