import java.util.ArrayList;

class Solution {
    public StringBuffer solution(String my_string, int num1, int num2) { // solution이라는 함수 안에 (매개변수)
        StringBuffer sb1 = new StringBuffer();
        ArrayList<String> charArr = new ArrayList<>();
        for (String str : my_string.split("")) {
            charArr.add(str);
        }
        String temp1 = charArr.get(num1);
        String temp2 = charArr.get(num2);
        charArr.set(num1, temp2);
        charArr.set(num2, temp1);
        for (String str: charArr) {
            sb1.append(str);
        }
        return sb1;
    }
}