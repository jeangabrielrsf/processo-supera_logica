import java.util.Scanner;

public class impressora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linesNumber = input.nextInt();
        input.nextLine();
        String[] phrases = new String[linesNumber];

        int count = 0;
        while (count < linesNumber) {
            phrases[count] = input.nextLine();
            count++;
        }

        input.close();


        System.out.print("[");
        for (int i = 0; i < phrases.length; i++) {
            System.out.print(phrases[i]);
            if (i != (phrases.length-1)) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}