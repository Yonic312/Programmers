import java.util.ArrayList;

class Solution {
    public ArrayList solution(int[] numbers, int num1, int num2) {
        ArrayList result = new ArrayList();
        for (int i = num1; i <= num2; i++) {
            result.add(numbers[i]);
        }
        return result;
    }
}