class Solution {
    public StringBuffer solution(String my_stirng, int n) {
        StringBuffer sb = new StringBuffer();
        for (String str: my_stirng.split("")) {
            for (int i = 0; i < n; i++) {
                sb.append(str);
            }
        }

        return sb;
    }
}