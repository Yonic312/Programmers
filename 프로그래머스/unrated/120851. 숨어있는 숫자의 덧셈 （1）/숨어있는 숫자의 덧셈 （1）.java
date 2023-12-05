class Solution {
    public int solution(String my_string) { // solution이라는 함수 안에 (매개변수)
        String[] numList = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int sum = 0;
        for (String str : my_string.split("")) {
            for (String num : numList) {
                if(num.equals(str)) {
                    sum += Integer.parseInt(num);
                    }
                }
            }
        return sum;
    }
}