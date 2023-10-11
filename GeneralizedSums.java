public class GeneralizedSum {
    public static void main(String[] args) {
        int start = 1; // Starting point
        int end = 10; // Ending point
        int step = 2; // Step size

        int sum = calculateGeneralizedSum(start, end, step);

        System.out.println("The generalized sum from " + start + " to " + end + " with a step size of " + step + " is: " + sum);
    }

    public static int calculateGeneralizedSum(int start, int end, int step) {
        int sum = 0;
        
        if (step > 0) {
            for (int i = start; i <= end; i += step) {
                sum += i;
            }
        } else if (step < 0) {
            for (int i = start; i >= end; i += step) {
                sum += i;
            }
        }

        return sum;
    }
}
