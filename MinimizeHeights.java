import java.util.Arrays;

public class MinimizeHeights {
    
    public static int getMinDiff(int[] arr, int k) {
        int n = arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr); //Step 01

        int ans = arr[n - 1] -  arr[0]; //Step 02

        for (int i = 1; i < n; i++) { // Step 3
            if (arr[i] - k < 0 ) continue; // Step 3.1

            int max = Math.max(arr[i - 1] + k, arr[n - 1] - k); // Step 3.2
            int min = Math.min(arr[0] + k, arr[i] - k);         // Step 3.3

            ans = Math.min(ans, max - min); // Step 3.4
        }

        return ans; // Step 4

}

public static void main(String[] args) {
    int[] arr = {1, 5, 8, 10};
    int k = 2;

    System.out.println("Minimized Height Difference: " + getMinDiff(arr, k));
}
}
