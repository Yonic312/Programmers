class Solution {
    public int solution(int[] array, int n) { // solution이라는 함수 안에 (매개변수)
        int cnt = 0;

        for (int num : array) {
            if(num > n)
                cnt++;
        }
        return cnt;
    }
}