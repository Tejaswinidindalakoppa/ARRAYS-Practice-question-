public class FindDuplicateNumber {
    public static int findDuplicates(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];

        // Phase 1: Detect cycle
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        // Phase 2: Find cycle entry (duplicate number)
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow; // or fast
    }

    public static void main(String[] args) {

        int[] nums = {3,1,3,4,2};
        System.out.println(findDuplicates(nums)); //output 3
    }
 }
