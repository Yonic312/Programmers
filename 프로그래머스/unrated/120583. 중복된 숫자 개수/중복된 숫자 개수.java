class Solution {
    public int solution(int[] my_string, int n) { // solution이라는 함수 안에 (매개변수) 
        int cnt = 0;

        for (int num : my_string) {
            if(num == n)
                cnt++;
        }
        return cnt;
    }
}