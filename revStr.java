import java.util.*;

class Solution {
    public void reverseString(char[] s) {
        int start = 0, end = s.length-1;
        char temp;
        while (start < end){
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        char[] s = {'F','A','Z'};
        sol.reverseString(s);
    }
}
