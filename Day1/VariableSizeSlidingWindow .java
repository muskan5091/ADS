public class VariableSizeSlidingWindow {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 2, 4, 3};
        int K = 7;
        int minLength = findMinLength(arr, K);
        System.out.println("Smallest subarray length with sum at least " + K + " is: " + minLength);
    }

    public static int findMinLength(int[] arr, int K) {
        int n = arr.length;
        int left = 0; 
        int sum = 0; 
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < n; right++) {
            sum += arr[right];
            while (sum >= K) {
                minLength = Math.min(minLength, right - left + 1);
                sum -= arr[left];
                left++;
            }
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}   
