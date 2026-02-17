public class FixedSizeSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {1, 12, -5, -6, 50, 3};
        int K = 4;
        double maxAverage = findMaxAverage(arr, K);
        System.out.println("Maximum average subarray value: " + maxAverage);
    }

    public static double findMaxAverage(int[] arr, int K) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < K; i++) {
            sum += arr[i];
        }
        int maxSum = sum;
        for (int i = K; i < n; i++) {
            sum += arr[i] - arr[i - K];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return (double) maxSum / K;
    }
}
