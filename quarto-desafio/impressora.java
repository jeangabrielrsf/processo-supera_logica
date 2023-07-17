import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class impressora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> left = new ArrayList<>();
        List<String> right = new ArrayList<>();


        int linesNumber = input.nextInt();
        input.nextLine();
        String[] phrases = new String[linesNumber];

        int count = 0;
        while (count < linesNumber) {
            phrases[count] = input.nextLine();
            count++;
        }

        input.close();

        for (int i = 0; i < phrases.length; i++) {
            for (int j = 0; j < phrases[i].length()/2;  j++) {
                String phrase = phrases[i];
                left.add(Character.toString(phrase.charAt(j)));
            }

            for (int j = phrases[i].length()/2 ; j < phrases[i].length(); j++) {
                String phrase = phrases[i];
                right.add(Character.toString(phrase.charAt(j)));
            }


            String leftReversed = "";
            for (int m = 0; m < left.size(); m ++) {
                leftReversed = left.get(m) + leftReversed;
            }

            String rightReversed = "";
            for (int n = 0; n < right.size(); n++) {
                rightReversed = right.get(n) + rightReversed;
            }


            System.out.println(leftReversed + rightReversed);
            right.clear();
            left.clear();
        }

    }
}