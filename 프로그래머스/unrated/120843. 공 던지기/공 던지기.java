class Solution {
    public int solution(int[] numbers, int k) { // solution이라는 함수 안에 (매개변수)
        int cnt = 0;
        for (int i = 0; i < k-1; i++, cnt += 2) {
        }

        while (cnt >= numbers.length)
            if(cnt >= numbers.length) {
                cnt -= numbers.length;
            }
        return numbers[cnt];
    }
}