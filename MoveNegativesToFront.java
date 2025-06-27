public class MoveNegativesToFront {

    static int[] move(int[] arr) {
         int j =0;

         for( int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++; // move j forward
            }
         }
         return arr;
    }

    public static void main(String[] args) {
        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] result = move(arr);

        for(int num : result) {
            System.out.print(num + " ");
        }
    }
}
