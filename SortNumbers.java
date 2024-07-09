import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        int i, j, temp;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of integers:");
        int num = sc.nextInt();
        
        int[] numbers = new int[num];

        System.out.println("Enter the integers:");
        for (i = 0; i < num; i++) {
            numbers[i] = sc.nextInt();
        }

        // Bubble sort algorithm to sort the numbers
        for (i = 0; i < num - 1; i++) {
            for (j = i + 1; j < num; j++) {
                if (numbers[i] > numbers[j]) {
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        System.out.println("Sorted integers are:");
        System.out.println(Arrays.toString(numbers));
    }
}
