class Solution {
    public StringBuffer solution(String my_stirng, String letter) {
        StringBuffer sb = new StringBuffer();
        for (String str : my_stirng.split("")) {
            if(str.equals(letter)){
                continue;
            } else {
                sb.append(str);
            }
        }
        return sb;
    }
}