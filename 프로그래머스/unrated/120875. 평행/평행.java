class Solution {
    public int solution(int[][] n) { // solution이라는 함수 안에 (매개변수)
        // 직선의 기울기 : (y1 - y2) / (x1 - x2)
        double answer = 0;
        double a = 0;
        double b = 0;

        a = ((double) (n[0][1] - n[1][1]) / (n[0][0] - n[1][0]));
        b = ((double) (n[2][1] - n[3][1]) / (n[2][0] - n[3][0]));
        if(a - b == 0) {
            answer = 1;
        }
        a = ((double) (n[0][1] - n[2][1]) / (n[0][0] - n[2][0]));
        b = ((double) (n[1][1] - n[3][1]) / (n[1][0] - n[3][0]));
        if(a - b == 0) {
            answer = 1;
        }
        a = ((double) (n[0][1] - n[3][1]) / (n[0][0] - n[3][0]));
        b = ((double) (n[1][1] - n[2][1]) / (n[1][0] - n[2][0]));
        if(a - b == 0) {
            answer = 1;
        }
        return (int) answer;
    }
}