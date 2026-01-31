import java.util.Scanner;

public class code8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];

        // Input array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Count frequency
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " -> " + count + " time" + (count > 1 ? "s" : ""));
        }
    }
}
