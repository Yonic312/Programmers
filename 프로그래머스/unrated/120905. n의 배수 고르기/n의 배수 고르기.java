import java.util.ArrayList;

class Solution {
    public ArrayList solution(int n, int[] numlist) { // solution이라는 함수 안에 (매개변수)
        ArrayList result = new ArrayList<>();
        for (int num : numlist) {
            if (num % n == 0) {
                result.add(num);
            }
        }
        return result;
    }
}