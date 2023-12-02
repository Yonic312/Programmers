class Solution {
    public int solution(int[] dot) { // solution이라는 함수 안에 (매개변수)
        int result = 0;

        if(dot[0] > 0) {
            if (dot[1] > 0) {
                result = 1;
            } else {
                result = 4;
            }
        } else if(dot[1] > 0) {
            result = 2;
        } else {
            result = 3;
        }
        return result;
    }
}