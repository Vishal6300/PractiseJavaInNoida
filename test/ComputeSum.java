public class ComputeSum {

    public static int computeEvenSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // 2. Write a function to compute the sum of n even numbers
        int n = 10;

        int res = computeEvenSum(n);
        System.out.println(res);

    }
}
