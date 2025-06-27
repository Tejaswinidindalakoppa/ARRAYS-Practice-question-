public class KthSmallestElement {

    // Function to find the kth smallest element
    public static int kthSmallest(int[] arr, int k) {
        return quickSelect(arr, 0, arr.length - 1, k - 1);
    }

    // QuickSelect logic
    public static int quickSelect(int[] arr, int low, int high, int k) {
        if (low <= high) {
            int pivotIndex = partition(arr, low, high);

            if (pivotIndex == k) {
                return arr[pivotIndex]; // Found the kth smallest
            } else if (pivotIndex > k) {
                return quickSelect(arr, low, pivotIndex - 1, k); // Search left
            } else {
                return quickSelect(arr, high, pivotIndex + 1, k); // Search right
            }
        }
        return -1; // Edge case, not needed usually
    }

    // Partition function (like QuickSort)
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as pivot
        int i = low;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        // Place pivot at correct position
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i; // Final position of pivot
    }

    // Main to test
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth smallest is: " + kthSmallest(arr, k)); // Output: 7

        int[] arr2 = {2, 3, 1, 20, 15};
        int k2 = 4;
        System.out.println("Kth smallest is: " + kthSmallest(arr2, k2)); // Output: 15
    }
}
