public class code9 {
    public static void main(String[] args) {
        int[] numbers = {34, 12, 5, 67, 1, 89};

        // Assume the first element is the smallest
        int smallest = numbers[0];

        // Traverse the array to find the smallest element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("The smallest element in the array is: " + smallest);
    }
}
