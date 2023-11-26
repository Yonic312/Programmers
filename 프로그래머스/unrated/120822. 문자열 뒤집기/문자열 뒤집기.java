class Solution {
    public StringBuffer solution(String my_string) {
        String result = my_string;
        String[] wordArr = my_string.split("");

        StringBuffer sb = new StringBuffer();

        for (int i = wordArr.length-1; i >= 0; i--) {
            sb.append(wordArr[i]);
        }
        return sb;
    }
}