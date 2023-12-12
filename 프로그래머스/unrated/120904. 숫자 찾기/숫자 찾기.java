class Solution {
    public int solution(int num, int k) { // solution이라는 함수 안에 (매개변수)
        int cnt = 1;
        String numS = Integer.toString(num);
        for (String str : numS.split("")) {

            if (str.equals(Integer.toString(k))){
                break;
            }else {
                cnt++;
            }
        }
        if(cnt > numS.split("").length)
            cnt = -1;
        return cnt;
    }
}