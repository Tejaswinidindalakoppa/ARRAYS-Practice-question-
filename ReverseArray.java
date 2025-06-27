public class ReverseArray {
    public static void main(String[] args) {
        
        // Step 1: Create an array with some numbers
        int[] arr ={1,2,3,4,5,6};

        // Step 2: Find the length of the array
        int n = arr.length;

        // Step 3: Create a new array to store reversed numbers
        int[] temp = new int[n];

        // Step 4: Copy numbers from arr to temp in reverse order
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n - 1 - i];
        }

        // Step 5: Print the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}
