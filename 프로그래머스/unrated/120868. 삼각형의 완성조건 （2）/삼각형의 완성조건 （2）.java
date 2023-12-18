class Solution {
    public int solution(int[] sides) { // solution이라는 함수 안에 (매개변수)
        int cnt = 0;
        int num1 = sides[0];
        int num2 = sides[1];

        int max = Math.max(num1, num2);
        for (int j = 0; j < max; j++) {
            if(Math.min(num1,num2) + j > max) {
                cnt++;
            }
        }

        for (int j = Math.max(num1, num2); j < num1 + num2; j++) {
            if (j < num1 + num2) {
                cnt++;
            }
        }

        return cnt;
    }
}