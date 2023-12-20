class Solution {
    public int solution(int[][] lines) { // solution이라는 함수 안에 (매개변수)
        // 변수 선언
        int answer = 0;
        // 200개 배열 만들기
        int[] count = new int[201];

        // lines 배열에 값을 가져와서 start, end로 지정
        for (int[] i : lines) {
            int start = i[0] + 100;
            int end = i[1] + 100;

            // start부터 end까지 count배열에 +1
            for (int j = start; j < end; j++) {
                count[j] += 1;
            }
        }

        for(int i : count) {
            if (i > 1) answer++;
        }
        return answer;
    }
}