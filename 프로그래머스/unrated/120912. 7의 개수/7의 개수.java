class Solution {
    public int solution(int[] my_string) { // solution이라는 함수 안에 (매개변수)
        int result = 0;
        String change;

        for (int i = 0; i < my_string.length; i++) {
            change = Integer.toString(my_string[i]);
            for (String str : change.split("")) {
                if(str.equals("7")) {
                    result ++;
                }
            }
        }
        return result;
    }
}