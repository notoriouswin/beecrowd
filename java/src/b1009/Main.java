package b1009;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        String nome = scan.next();
        double salarioBase = scan.nextDouble();
        double venda = scan.nextDouble();
        double comissao = venda * 0.15;
        double totalSalario = salarioBase + comissao;

        System.out.printf("TOTAL = R$ %.2f%n",totalSalario);
    }
}
