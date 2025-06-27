public class Sort012 {
    
    public static void sortColors(int[] arr) {
        int low = 0, mid = 0, high =arr.length -1;

        while(mid <= high) {
            switch(arr[mid]) {
                case 0:
                   int temp0 = arr[low];
                   arr[low] = arr[mid];
                   arr[mid] = temp0;
                   low++;
                   mid++;
                   break;

                case 1:
                   mid++;
                   break;

                case 2: 
                   int temp2 = arr[mid];
                   arr[mid] = arr[high];
                   arr[high] = temp2;
                   high--;
                   break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};
        sortColors(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
