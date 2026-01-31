import java.util.Scanner;

public class code4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;

        // Input array elements and calculate sum
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // Output sum
        System.out.println(sum);
    }
}
