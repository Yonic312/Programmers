import java.util.Arrays;
class Solution {
    public int[] solution(int money) {
        int coffee = 5500;
        int num = 0;
        int change = 0;
        if(money >= coffee) {
            num = money / coffee;
            change = money % coffee;
        } else {
            num = 0;
            change = money;
        }
        int[] result = new int[] {num, change};

        return result;
    }
}