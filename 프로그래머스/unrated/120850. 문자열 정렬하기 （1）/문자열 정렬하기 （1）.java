import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int[] solution(String my_string) { // solution이라는 함수 안에 (매개변수)
        ArrayList<String> temp = new ArrayList();
        for (String str : my_string.split("")) {
            if(str.equals("0") || str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || str.equals("6") || str.equals("7") || str.equals("8") || str.equals("9")) {
                temp.add(str);
            }
        }
        Collections.sort(temp);
        int[] result = new int[temp.size()];

        for (int i = 0; i < temp.size(); i++) {
            result[i] = Integer.valueOf(temp.get(i));
        }
        return result;
    }
}