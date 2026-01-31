public class code12 {
    public static void main(String[] args) {
        int[][] matrix = {
            {12, 45, 7},
            {89, 23, 56},
            {34, 90, 11}
        };

        // Assume the first element is the largest
        int largest = matrix[0][0];

        // Traverse the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        System.out.println("The largest element in the 2D array is: " + largest);
    }
}
