class Solution {
    public int solution(int hp) { // solution이라는 함수 안에 (매개변수)
       int cnt = 0;
       int restHp = hp;
       int 장군개미 = 5;
       int 병정개미 = 3;
       int 일개미 = 1;

       cnt += restHp / 장군개미;
       restHp %= 장군개미;

        cnt += restHp / 병정개미;
        restHp %= 병정개미;

        cnt += restHp / 일개미;
        restHp %= 일개미;


        return cnt;
    }
}