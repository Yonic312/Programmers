class Solution {
    public StringBuffer solution(int age) {
        StringBuffer sb = new StringBuffer();
        String Age = Integer.toString(age);

        for (String str : Age.split("")) {
            if (str.equals("0")) {
                sb.append("a");
            } else if (str.equals("1")) {
                sb.append("b");
            }else if (str.equals("2")) {
                sb.append("c");
            }else if (str.equals("3")) {
                sb.append("d");
            }else if (str.equals("4")) {
                sb.append("e");
            }else if (str.equals("5")) {
                sb.append("f");
            }else if (str.equals("6")) {
                sb.append("g");
            }else if (str.equals("7")) {
                sb.append("h");
            }else if (str.equals("8")) {
                sb.append("i");
            }else if (str.equals("9")) {
                sb.append("j");
            }
        }
        return sb;
    }
}