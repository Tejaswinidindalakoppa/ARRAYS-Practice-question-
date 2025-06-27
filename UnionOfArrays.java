import java.util.HashSet;

public class UnionOfArrays {
    
    // Step 1: Function to return count of union elements
    public static int doUnion(int[] a, int[] b) {
        // Step 2: Create an empty HashSet to store unique elements
        HashSet<Integer> set = new HashSet<>();

        // Step 3: Add all elements of array a to the set
        for (int num : a) {
            set.add(num); // Duplicates will be ignored automatically
        }
        
        // Step 4: Add all elements of array b to the set
        for (int num : b) {
            set.add(num); // Again, duplicates will be ignored
        }
        
        // Step 5: Return the total count of unique elements
        return set.size();

    }

    public static void main(String[] args) {
        // Step 6: Define arrays
        int[] a1 = {1,2,3,4,5};
        int[] b1 = {1,2,3};

        // Step 7: Call the function and print result
        System.out.println("union count:" + doUnion(a1, b1) ); //output: 5

       //Example
       int[] a2 = {7,6,4,5,3,4,3};
       int[] b2 = {8,4,5,6};
       System.out.println("Union numbers:" + doUnion(a2,b2));

       //Example
       int[] a3 = {8,9,5,3,4,0};
       int[] b3 = {7,4,3,8,9};
       System.out.println("wanted numbers:" + doUnion(a3,b3));
    }
}
