public class KadaneAlgorithm {
    
    public static int maxSubArraySum(int[] nums){
        int sum=0;
        int max_sum = nums[0];

        for(int i =0;i < nums.length; i++){
            sum = sum+nums[i];
            if(sum>max_sum){
                max_sum = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArraySum(nums));
    }
}

//Or 

// public class KadaneAlgorithm {
    
//     public static int maxSubArraySum(int[] arr){
//         int maxSoFar = arr[0];  // Overall maximum sum seen so far
//         int currentMax = arr[0]; // Max sum including current element

//         for (int i = 1; i < arr.length; i++) {

//             // Either take the current element alone, or extend previous sum
//             currentMax = Math.max(arr[i], currentMax + arr[i]);

//             // Update maxSoFar if currentMax is bigger
//             maxSoFar = Math.max(maxSoFar, currentMax);
//         }

//         return maxSoFar;
//     }

//     public static void main(String[] args) {
//         int[] arr = {2,3,-8,7,-1,2,3};
//         System.out.println("Max subarray sum:" + maxSubArraySum(arr));
//     }
// }




        