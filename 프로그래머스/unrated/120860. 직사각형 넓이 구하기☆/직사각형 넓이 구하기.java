class Solution {
    public int solution(int[][] dots) { // solution이라는 함수 안에 (매개변수)   
        int result = 0;
        int minX = dots[0][0];
        int minY = dots[0][1];
        int maxX = dots[0][0];
        int maxY = dots[0][1];

        for (int i = 1; i < dots.length; i++) {
            minX = Math.min(minX, dots[i][0]);
            minY = Math.min(minY, dots[i][1]);
            maxX = Math.max(maxX, dots[i][0]);
            maxY = Math.max(maxY, dots[i][1]);
        }

        result = (maxX - minX) * (maxY - minY);
        return result;
    }
}
