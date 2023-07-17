import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) {
        int size, target;
        Scanner input = new Scanner(System.in);


        size = Integer.parseInt(input.next());
        target = Integer.parseInt(input.next());


        System.out.println("tamanho do array: " + size);
        System.out.println("Valor alvo: " + target);
    }    
}
