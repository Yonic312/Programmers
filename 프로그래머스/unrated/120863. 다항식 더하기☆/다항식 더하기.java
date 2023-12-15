class Solution {
    public StringBuffer solution(String polynomial) { // solution이라는 함수 안에 (매개변수)
        StringBuffer sb = new StringBuffer();
        int xNum = 0;
        int num = 0;

        for (String str : polynomial.split(" ")) { // 3x, "+", 7
            if (str.contains("x")) {
                xNum += str.equals("x")? 1 : Integer.parseInt(str.replaceAll("x", ""));
            } else if (!str.equals("+")) {
                num += Integer.parseInt(str);
            }
        }
        if (xNum != 0) {
            if (xNum == 1) {
                sb.append("x");
            } else {
                sb.append(xNum + "x");
            }
        }
        if (num != 0) {
            if(xNum != 0) {
                sb.append(" + " + num);
            }else {
                sb.append(num);
            }
        }
        return sb;
    }
}
