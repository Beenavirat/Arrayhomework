import java.util.Scanner;
// To sort array elements in ascending order
public class ArraySum {

    public static void main(String[] args) {

        int count, temp;
        // user inputs the array size
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of elements in array:");
        count = scanner.nextInt();
        int num[] = new int[count];
        System.out.println("enter array elements");

        for (int i = 0; i < count; i++)   // for loop  to count no of elemente
        {
            num[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < count; i++) // for loop to count no of elements
        {
            for (int j = i + 1; j < count; j++)   // for loop
            {
                if (num[i] > num[j]) // if condition
                {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }
        System.out.println(" Array elements in ascending order:");
        for (int i = 0; i < count - 1; i++) {
            System.out.println(num[i] + ",");
        }
        System.out.println(num[count - 1]);

    }
}











