public class OptimizedOddSum {
    public static void main(String[] args) {
        long n = 1000000000; // Adjust n to the desired number of odd numbers

        long sum = calculateOddSumOptimized(n);

        System.out.println("The sum of the first " + n + " odd numbers is: " + sum);
    }

    public static long calculateOddSumOptimized(long n) {
        // Formula for the sum of the first n odd numbers: n^2
        long sum = n * n;
        return sum;
    }
}
