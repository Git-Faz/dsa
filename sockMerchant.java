import java.util.HashMap;
import java.util.List;

class Solution {

    public static int sockMerchant(int n, List<Integer> ar) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for (int i = 0; i < n; i++) {
            int color = ar.get(i);
            map.put(color, map.getOrDefault(color, 0) + 1);

            if (map.get(color) % 2 == 0) {
                pairs++;
            }
        }

        return pairs;
    }

    public static void main(String[] args) {}
}
