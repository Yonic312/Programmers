import java.util.ArrayList;

class Solution {
    public StringBuffer solution(String my_string) { // solution이라는 함수 안에 (매개변수)
        StringBuffer sb = new StringBuffer();
        ArrayList dup = new ArrayList();

        for (String str: my_string.split("")) {
            if (dup.contains(str)) {
                continue;
            }else {
                sb.append(str);
                dup.add(str);
            }
        }
        return sb;
    }
}