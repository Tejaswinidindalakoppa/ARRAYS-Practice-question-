public class RotateArrayByOne {
    
    // Function to rotate array by one (clockwise)
    public static void rotate(int[] arr) {
        int n = arr.length;

        // Step 1: Save last element
        int last = arr[n-1];

        // Step 2: Shift all elements to the right
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Step 3: Put last element at first index
        arr[0] = last;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // Call rotate function
        rotate(arr);

        // Print the rotated array
        for(int num : arr) {
            System.out.println(num);
        }
    }

}
