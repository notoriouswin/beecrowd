package b1010;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int numeroProduto1 = scan.nextInt();
        int quantProduto1 = scan.nextInt();
        double valorProduto1 = scan.nextDouble();
        double valorAPagar1 = quantProduto1 * valorProduto1;

        int numeroProduto2 = scan.nextInt();
        int quantProduto2 = scan.nextInt();
        double valorProduto2 = scan.nextDouble();
        double valorAPagar2 = quantProduto2 * valorProduto2;

        double valorTotalAPagar = valorAPagar1 + valorAPagar2;

        System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorTotalAPagar);
    }
}
