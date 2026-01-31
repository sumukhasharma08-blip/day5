import java.util.Scanner;

public class code7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] temp = new int[n];
        int newSize = 0;

        // Remove duplicates
        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[newSize] = arr[i];
                newSize++;
            }
        }

        // Print array after removing duplicates
        for (int i = 0; i < newSize; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
