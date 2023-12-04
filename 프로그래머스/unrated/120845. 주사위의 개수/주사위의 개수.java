class Solution {
    public int solution(int[] box, int n) { // solution이라는 함수 안에 (매개변수)
        int right = box[0];
        int left = box[1];
        int top = box[2];

        int result = (right / n) * (left / n) * (top / n);
        return result;
    }
}