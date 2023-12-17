class Solution {
    public int solution(String my_string) { // solution이라는 함수 안에 (매개변수)
        int temp = 0;
        int sum = 0;

        for (String str : my_string.split("")) {
            if (str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || str.equals("6") || str.equals("7") ||  str.equals("8") || str.equals("9") || str.equals("0")) {
                temp = (temp * 10) + Integer.parseInt(str);
            } else {
                sum += temp;
                temp = 0;
            }
        }
        if (temp != 0) {
            sum += temp;
        }
        return sum;
    }
}
