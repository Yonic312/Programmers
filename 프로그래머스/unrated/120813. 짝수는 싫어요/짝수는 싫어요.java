import java.util.ArrayList;
class Solution {
    public ArrayList solution(int n) {
        ArrayList result = new ArrayList();

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                continue;
            }else {
                result.add(i);
            }
        }

        return result;
    }
}