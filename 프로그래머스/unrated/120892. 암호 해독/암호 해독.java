class Solution {
    public StringBuffer solution(String cipher, int code) { // solution이라는 함수 안에 (매개변수)
        StringBuffer sb = new StringBuffer();

        for (int i = code-1; i < cipher.length(); i = i + code) {
            sb.append(cipher.substring(i,i+1));
        }
        return sb;
    }
}