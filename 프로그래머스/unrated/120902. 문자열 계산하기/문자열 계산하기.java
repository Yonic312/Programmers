class Solution {
    public int solution(String my_string) { // solution이라는 함수 안에 (매개변수)
        int result = 0;
        String tempSign = "+";
        for (String str : my_string.split(" ")) {
            if (str.equals("+")){
                tempSign = "+";
                continue;
            } else if(str.equals("-")) {
                tempSign = "-";
                continue;
            }
            if(tempSign.equals("+")) {
                result += Integer.parseInt(str);
            } else if (tempSign.equals("-")) {
                result -= Integer.parseInt(str);
            }
        }
        return result;
    }
}