class Solution {
    public int solution(int n) { // solution이라는 함수 안에 (매개변수)
        int sum = 0;
        String temp = Integer.toString(n);
        for (String str : temp.split("")) {
            sum += Integer.parseInt(str);
        }
        return sum;
    }
}