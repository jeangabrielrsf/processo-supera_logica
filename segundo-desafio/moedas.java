import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class moedas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        int qtd100 = 0;
        int qtd50 = 0;
        int qtd20 = 0;
        int qtd10 = 0;
        int qtd5 = 0;
        int qtd2 = 0;
        int qtd1 = 0;

        double qtd05 = 0.0;
        double qtd025 = 0.0;
        double qtd010 = 0.0;
        double qtd005 = 0.0;
        double qtd001 = 0.0;

        double value = scan.nextDouble();


        scan.close();

        while (value !=0) {
            if ((value - 100) >= 0) {
                System.out.println("Entrei na nota 100");
                value = value - 100;
                qtd100++;

            }
            else if ((value - 50) >= 0) {
                System.out.println("Entrei na nota 50");
                value -= 50;
                qtd50++;

            }
            else if ((value - 20) >= 0) {
                System.out.println("Entrei na nota 20");
                value -= 20;
                qtd20++;
            }
            else if ((value - 10) >= 0) {
                System.out.println("Entrei na nota 10");
                value -= 10;
                qtd10++;
            } 
            else if ((value - 5) >= 0) {
                System.out.println("Entrei na nota 5");
                value -= 5;
                qtd5++;
            } 
            else if ((value - 2 )>= 0) {
                System.out.println("Entrei na nota 2");
                value -= 2;
                qtd2++;
            } 
            else if ((value - 1) >= 0.00) {
                System.out.println("Entrei na moeda 1");
                value -= 1;
                qtd1++;
            } 
            else if ((value - 0.5) >= 0.00) {
                System.out.println("Entrei na moeda 0.50");
                value -= 0.5;
                qtd05++;
            } 
            else if ((value - 0.25) >= 0.00) {
                System.out.println("Entrei na moeda 0.25");
                value -= 0.25;
                qtd025++;
            } 
            else if ((value - 0.10) >= 0.00) {
                System.out.println("Entrei na moeda 0.10");
                value -= 0.10;
                qtd010++;
            } 
            else if ((value - 0.05) >= 0.00) {
                System.out.println("Entrei na moeda 0.05");
                value -= 0.05;
                qtd005++;
            } 
            else if ((value - 0.01) >= 0.0)  {
                System.out.println("Entrei na moeda 0.01");
                value -= 0.01;
                qtd001++;
            } 
            System.out.println("Valor : " + value);
        }

        System.out.println("NOTAS:");
        System.out.println(qtd100 + " nota(s) de R$ 100.00");
        System.out.println(qtd50 + " nota(s) de R$ 50.00");
        System.out.println(qtd20 + " nota(s) de R$ 20.00");
        System.out.println(qtd10 + " nota(s) de R$ 10.00");
        System.out.println(qtd5 + " nota(s) de R$ 5.00");
        System.out.println(qtd2 + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println((int)qtd1 + " moeda(s) de R$ 1.00");
        System.out.println((int)qtd05 + " moeda(s) de R$ 0.50");
        System.out.println((int)qtd025 + " moeda(s) de R$ 0.25");
        System.out.println((int)qtd010 + " moeda(s) de R$ 0.10");
        System.out.println((int)qtd005 + " moeda(s) de R$ 0.05");
        System.out.println((int)qtd001 + " moeda(s) de R$ 0.01");
    }
}
