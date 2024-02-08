public class MaxSumISTask {
    public static void main(String[] args) {
        // Treeleaf Assignment
        int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11};
        int ans = maxSumIncrSubseq(arr, arr.length);
        System.out.println("Maximum Sum Increasing Subsequence: " + ans);
    }



    //TODO: Method to find Maximum Sum Increasing Subsequence
    public static int maxSumIncrSubseq(int[] arr, int n) {
        int[] maxSumEndIndex = new int[n];

        for (int i = 0; i < n; i++) {
            maxSumEndIndex[i] = arr[i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && maxSumEndIndex[i] < maxSumEndIndex[j] + arr[i]) {
                    maxSumEndIndex[i] = maxSumEndIndex[j] + arr[i];
                }
            }
        }

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (maxSumEndIndex[i] > maxSum) {
                maxSum = maxSumEndIndex[i];
            }
        }

        // Return the maximum sum
        return maxSum;
    }
}