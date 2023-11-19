import java.util.ArrayList;
class Solution {
    public int solution(int[] array) {
        int cnt = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    cnt++;
                }
            }
            if(cnt > max) {
                max = cnt;
            }
            cnt = 0;
        }

        ArrayList result = new ArrayList();


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    cnt++;
                }
            }
            if (cnt == max && !result.contains(array[i])) {
                result.add(array[i]);
            }
            cnt = 0;
        }

        return result.size() == 1 ? (int) result.get(0) : -1;
    }
}