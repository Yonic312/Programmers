import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int st;
        int[] result = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            st = emergency.length;
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] > emergency[j]) {
                    st -= 1;
                }
            }
            result[i] = st;
        }
        return result;
    }
}