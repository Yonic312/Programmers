import java.util.ArrayList;

class Solution {
    public ArrayList solution(int n) { // solution이라는 함수 안에 (매개변수)
        ArrayList numArr = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if(n % i == 0) {
                numArr.add(i);
            }

        }
        return numArr;
    }
}