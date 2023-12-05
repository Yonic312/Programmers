class Solution {
    public int solution(String s) { // solution이라는 함수 안에 (매개변수)
        int saveNum = 0;
        int sum = 0;
        for (String str : s.split(" ")) {
            if(str.equals("Z")) {
                sum -= saveNum;
            } else {
                saveNum = Integer.parseInt(str);
                sum += saveNum;
            }
        }
        return sum;
    }
}