class Solution {
    public int solution(int order) { // solution이라는 함수 안에 (매개변수)
        String change = Integer.toString(order);
        int cnt = 0;
        for (String str : change.split("")) {
            if(str.equals("3") || str.equals("6") || str.equals("9")){
                cnt++;
            }
        }
        return cnt;
    }
}