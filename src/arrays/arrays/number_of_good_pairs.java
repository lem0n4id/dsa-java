package arrays.arrays;

public class number_of_good_pairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        int ans = numIdenticalPairs(nums);
        System.out.println(ans);
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < j; i++) {
                if (nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
