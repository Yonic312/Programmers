import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class Solution {
    public ArrayList<String> solution(int n) { // solution이라는 함수 안에 (매개변수)
        HashSet temp = new HashSet();
        while (n != 1) {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    n /= i;
                    temp.add(i);
                    break;
                }
            }
        }
        ArrayList<String> result = new ArrayList<String>(temp);
        Collections.sort(result);
        return result;
    }
}
