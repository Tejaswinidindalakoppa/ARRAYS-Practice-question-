public class MinMaxArray {
    public static void main(String[] arg) {

        int arr[] = {1,2,3,4,5,6,7};

        int max,min;
        int i;

        int n = arr.length;

        if (n % 2 == 0) {
            if (arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];
            } else {
                max = arr[1];
                min = arr[0];
            }
            i = 2;
            } else {
                max = arr[0];
                min = arr[0];
                i = 1;
            }

            while (i < n - 1) {
                int a = arr[i];
                int b = arr[i + 1];

                if (a > b) {
                    if (a > max) max = a;
                    if (b < min) min = b;
                } else {
                    if (b > max) max = b;
                    if (a < min) min = a;
                }

                i += 2;
            }

            System.out.println("Minimum: " + min);
            System.out.println("Maximum: " + max);
        }

    }

