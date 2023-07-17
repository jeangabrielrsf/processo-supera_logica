import java.util.Scanner;

public class diferenca {
    public static void main(String[] args) {
        int size, target, index, count;
        Scanner input = new Scanner(System.in);


        size = input.nextInt();
        target = input.nextInt();
        input.nextLine();
        int[] array = new int[size];
        index = 0;
        while (index < size) {
            array[index] = input.nextInt();
            index++;
        }
        input.close();

        count = 0;
        for (int i = 0; i < size-1; i ++) {
           for (int j = i+1; j < size; j++) {
                if (Math.abs(array[i] - array[j]) == target) {
                    count++;
                }
           }
        }
        System.out.println(count);
    }    
}
