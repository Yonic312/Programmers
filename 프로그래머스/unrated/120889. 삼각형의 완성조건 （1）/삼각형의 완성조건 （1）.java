import java.util.Arrays;

class Solution {
    public int solution(int[] sides) { // solution이라는 함수 안에 (매개변수)
        int result = 0;
        Arrays.sort(sides);

        if(sides[2] < sides[0] + sides[1]) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }
}