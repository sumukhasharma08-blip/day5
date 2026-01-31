import java.util.Scanner;

public class code5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input element to search
        int key = sc.nextInt();

        boolean found = false;

        // Search for the element
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        // If element not found
        if (!found) {
            System.out.println("Element not found");
        }
    }
}
