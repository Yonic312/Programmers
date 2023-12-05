class Solution {
    public StringBuffer solution(String my_string) { // solution이라는 함수 안에 (매개변수)
        StringBuffer sb = new StringBuffer();
        for (String str : my_string.split("")) {
            if (str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")) {
                continue;
            } else {
                sb.append(str);
            }
        }
        return sb;
    }
}