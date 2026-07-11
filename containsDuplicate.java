import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
            set.add(n);
        }

        return false;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = { 2, 3, 5, 9, 6, 7, 2 };
        System.out.println(sol.containsDuplicate(nums));
    }
}
