import java.util.Arrays;

class Solution {
    public String[] solution(String[] quiz) { // solution이라는 함수 안에 (매개변수)
        String[][] str_arr = new String[quiz.length][5];
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            str_arr[i] = quiz[i].split(" ");

            int result = 0;
            if(str_arr[i][1].equals("+")) {
                result = Integer.parseInt(str_arr[i][0]) + Integer.parseInt(str_arr[i][2]);
                if(result == Integer.parseInt(str_arr[i][4])) {
                    answer[i] = "O";
                }else {
                    answer[i] = "X";
                }
            } else if(str_arr[i][1].equals("-")) {
                result = Integer.parseInt(str_arr[i][0]) - Integer.parseInt(str_arr[i][2]);
                if(result == Integer.parseInt(str_arr[i][4])) {
                    answer[i] = "O";
                }else {
                    answer[i] = "X";
                }
            }
        }
        return answer;
    }
}
