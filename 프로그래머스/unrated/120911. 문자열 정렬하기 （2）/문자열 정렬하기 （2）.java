import java.util.Arrays;
import java.util.Locale;

class Solution {
    public StringBuffer solution(String my_string) { // solution이라는 함수 안에 (매개변수)
        StringBuffer sb = new StringBuffer();
        my_string.toLowerCase(Locale.ROOT);
        char[] result = new char[my_string.length()];
        my_string = my_string.toLowerCase();
        for (int i = 0; i < my_string.length(); i++) {
            result[i] = my_string.charAt(i);
        }
        Arrays.sort(result);

        for (char str : result) {
            sb.append(str);
        }
        return sb;
    }
}