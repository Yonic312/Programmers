import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) { // solution이라는 함수 안에 (매개변수)
        Arrays.sort(numbers);

        int result = numbers[numbers.length-1] * numbers[numbers.length-2];
        return result;
    }
}