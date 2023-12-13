class Solution {
    public int solution(String str1, String str2) { // solution이라는 함수 안에 (매개변수)
        int result = 0;

        if(str1.contains(str2)) {
            result = 1;
        } else {
            result = 2;
        }
        return result;
    }
}