import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) { // solution이라는 함수 안에 (매개변수)
        int max = 0;
        int cnt = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
                cnt = i;
            }
        }
        return new int[]{max, cnt};
    }
}
