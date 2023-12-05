import java.util.Arrays;
class Solution {
    public int[] solution(String[] strlist) { // solution이라는 함수 안에 (매개변수)
        int[] result = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
            result[i] = strlist[i].length();
        }
        return result;
    }
}