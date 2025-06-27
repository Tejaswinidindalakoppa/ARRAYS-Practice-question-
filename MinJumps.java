public class MinJumps {
    public static int minJumps(int[] arr) {
        int n = arr.length;

        // 🚫 Edge case: If the array is empty or first element is 0, we can't move
        if (n == 0 || arr[0] == 0)
        return -1;

        int jumps = 0;       // 💡 Number of jumps we’ve taken so far
        int farthest = 0;    // 💡 The farthest index we can reach right now 
        int currentEnd = 0;  // 💡 The end of the current jump range

        // ✅ Loop until the second-last index (because we check if we can reach the last)
        for (int i =0; i < n - 1; i++) {
            // Update the farthest we can reach from this point
            farthest = Math.max(farthest, i + arr[i]);

            // 🚀 If we reach the end of the range for the current jump
            if (i == currentEnd) {
                jumps++;         // Take a jump
                currentEnd = farthest;  // Set the new jump range

                // If we are stuck and can't move forward
                if (currentEnd <= i)
                   return -1;
            }
        }

        //  After the loop, check if we could reach the end
        return currentEnd >= n -1 ? jumps : -1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,3,5,8,9,2,6,7,6,8,9};
        int[] arr2 = {1,4,3,2,6,7};
        int[] arr3 = {0,10,20};

        System.out.println(minJumps(arr1));
        System.out.println(minJumps(arr2));
        System.out.println(minJumps(arr3));
    }
}
