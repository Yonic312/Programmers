class Solution {
    public int solution(int[][] board) { // solution이라는 함수 안에 (매개변수)
        // 변수 선언
        int answer = 0;

        // dx / nx

        // 1의 자리 빼고 1로 표시 할 좌표들
        int[] dx = {-1, 1, 0, 0, -1, +1, +1, -1};
        int[] dy = {0, 0, 1, -1, 1, 1, -1, -1};
        // 자주 사용 되는 값을 선언
        int length = board.length;

        // 1을 체크 할 bool 자료형 이중 배열
        boolean[][] checkBoard = new boolean[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {

                for (int k = 0; k < 8; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (board[i][j] == 1) {
                        checkBoard[i][j] = true;
                    }

                    if (nx >= 0 && nx < length && ny >= 0 && ny < length && board[i][j] == 1) {
                        checkBoard[nx][ny] = true;
                    }
                }

            }
        }
        // checkBoard에서 answer 변수로 false 체크하기
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (!checkBoard[i][j]) {
                    answer++;
                }
            }
        }
        return answer;
    }
}