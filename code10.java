public class code10 {
    public static void main(String[] args) {
        int[] numbers = {12, 7, 5, 8, 19, 24, 3};

        int evenCount = 0;
        int oddCount = 0;

        // Loop through the array
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
