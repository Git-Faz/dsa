import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
class Solution{

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int compl = target - nums[i]; // find complement
            if (map.containsKey(compl)) { // check if complement already exists, if true:
                return new int[]{i, map.get(compl)}; // in the new array, return the current index, along with the index of complement, because compl + current num = target
            }
            map.put(nums[i],i);//put the num as Key and its index as Value if complement doesnt exist yet
        }
        return new int[]{}; //return empty array if no valid pair exists
    }

    public static void main (String[] args) {
        Solution sol = new Solution();
        int [] nums = {3,4,5,2};
        int target = 6;
        int[] result = sol.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
