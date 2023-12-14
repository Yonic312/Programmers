import java.util.Arrays;
class Solution {
    public String[] solution(String my_string, int n) { // solution이라는 함수 안에 (매개변수)
        int roop = my_string.length()/n;
        int cnt = 0;
        int i = 0;

        if (my_string.length() % n != 0)
            roop++;

        String[] arr = new String[roop];
        for (String str : my_string.split("")) {
            if(cnt == n) {
                cnt = 0;
                i++;
            }

            if(cnt == 0) {
                arr[i] = str;
                cnt++;
                continue;
            }

            arr[i] += str;
            cnt++;


        }
        return arr;
    }
}