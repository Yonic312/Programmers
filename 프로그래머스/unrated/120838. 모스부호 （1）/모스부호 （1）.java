class Solution {
    public StringBuffer solution(String letter) { // solution이라는 함수 안에 (매개변수)
        StringBuffer sb = new StringBuffer();
        String[] apb = new String[] {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        for (String str : letter.split(" ")) {
            for (int i = 0; i < apb.length; i++) {
                if(str.equals(apb[i])) {
                    sb.append((char)(97+i));
                }
            }
        }
        return sb;
    }
}