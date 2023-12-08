class Solution {
    public StringBuffer solution(String my_string) { // solution이라는 함수 안에 (매개변수)
        StringBuffer sb = new StringBuffer();
        char[] arrCh = my_string.toCharArray(); // 1. char 배열로 받아서
        char temp = 0;

        for (char str: arrCh) { // 2. 하나씩 뽑아서
            if((int)str >= 97){
                temp = (char)((int)str - 32); // sb에 계산하여 넣기
                sb.append(temp);
            } else {
                temp = (char)((int)str + 32);
                sb.append(temp);
            }
        }
        return sb;
    }
}