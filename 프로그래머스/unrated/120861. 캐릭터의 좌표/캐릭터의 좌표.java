import java.util.Arrays;

class Solution {
    public int[] solution(String[] keyinput, int[] board) { // solution이라는 함수 안에 (매개변수)
        int[] now = {0, 0};
        for (String str : keyinput) {
            if (str.equals("up")) {
                if (-(board[1] / 2) <= now[1] && now[1] < (board[1] / 2)) {
                    now[1] += 1;
                }
            } else if (str.equals("down")) {
                if (-(board[1] / 2) < now[1] && now[1] <= (board[1] / 2)) {
                    now[1] -= 1;
                }
            } else if (str.equals("left")) {
                if (-(board[0] / 2) < now[0] && now[0] <= (board[0] / 2)) {
                    now[0] -= 1;
                }
            } else if (str.equals("right")) {
                if (-(board[0] / 2) <= now[0] && now[0] < (board[0] / 2)) {
                    now[0] += 1;
                }
            }
        }
        return now;
    }
}