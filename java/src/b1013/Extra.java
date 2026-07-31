package b1013;

import java.util.Locale;
import java.util.Scanner;

public class Extra {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Escolha um numero:");
        int a = scan.nextInt();
        System.out.print("\nEscolha outro numero:");
        int b = scan.nextInt();

        int maior = (a + b + Math.abs(a - b)) /2;
        System.out.printf("%nO numero %d é o maior",maior);

        System.out.printf("%nEscolha outro numero:");
        int c = scan.nextInt();

        maior = (maior + c + Math.abs(maior - c)) /2;
        System.out.printf("%nO numero %d é o maior",maior);

        boolean reply = true;
        int i = 0;
        while(reply == true){
            System.out.printf("%nEscolha outro numero:");
            c = scan.nextInt();
            maior = (maior + c + Math.abs(maior - c)) /2;
            System.out.printf("%nO %d é o maior",maior);
            i++;

            if (i == 5){
                System.out.print("\nVocê quer continuar?\nResponda com: Sim ou Não\n");
                String resposta = scan.next();
                if (resposta.equalsIgnoreCase("Sim")){
                    reply = true;
                    i = 0;
                } else if(resposta.equalsIgnoreCase("Não")){
                    reply = false;
                } else {
                    System.err.println("Erro: valor inválido.");
                }
            }
        }
    }
}