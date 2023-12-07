import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) { // solution이라는 함수 안에 (매개변수)
        Arrays.sort(array);
        int temp = 0;
        int cnt = 0;
        int len = 101;
        int i = -1;
        for (int num: array) {
            i++;
            temp = Math.abs(n - num);
            if (len > temp) {
                len = temp;
                cnt = i;
            } else if(len == temp){
                continue;
            }
        }
        return array[cnt];
    }
}