class Solution {
    public StringBuffer solution(String rsp) { // solution이라는 함수 안에 (매개변수)
        StringBuffer sb = new StringBuffer();
        for (String str : rsp.split("")) {
            if(str.equals("2")) {
                sb.append("0");
            } else if(str.equals("0")) {
                sb.append("5");
            } else if (str.equals("5")) {
                sb.append("2");
            }
        }
        return sb;
    }
}