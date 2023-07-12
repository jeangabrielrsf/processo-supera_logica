import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
class par_impar {
    public static void main(String[] args) {
        List<Integer> evens = new ArrayList<>(); //lista de pares
        List<Integer> odds = new ArrayList<>(); //lista de ímpares
        Scanner scan = new Scanner(System.in);

        int size = scan.nextInt();
        int[] numbers = new int[size];
        for (int i=0; i < size; i++) {
            numbers[i] = scan.nextInt();
        }
        scan.close();

        //populando arrays de pares e ímpares
        for (int i=0; i < size; i++) {
            if (numbers[i] % 2 == 0) {
                evens.add(numbers[i]);
            } else {
                odds.add(numbers[i]);
            }
        }
        //ordenando pares
        evens.sort(Comparator.naturalOrder());

        //ordenando ímpares
        odds.sort(Comparator.reverseOrder());

        //alterando os valores do array original para os valores já ordenados
        for (int i=0; i < evens.size(); i++) {
            numbers[i] = evens.get(i);
        }
        for (int i=0; i < odds.size(); i++) {
            numbers[evens.size()+ i] = odds.get(i);
        }

        //imprimindo o array no console
        for (int i=0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }

} 
