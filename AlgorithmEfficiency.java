public class EfficientOddSum {
    public static void main(String[] args) {
        long limit = 1000000000; // Adjust the limit to the desired value

        long sum = calculateOddSumEfficiently(limit);

        System.out.println("The sum of all odd numbers up to " + limit + " is: " + sum);
    }

    public static long calculateOddSumEfficiently(long limit) {
        // Calculate the number of odd numbers up to the limit
        long numTerms = (limit + 1) / 2;

        // Use the formula for the sum of consecutive odd numbers: numTerms^2
        long sum = numTerms * numTerms;

        return sum;
    }
}
