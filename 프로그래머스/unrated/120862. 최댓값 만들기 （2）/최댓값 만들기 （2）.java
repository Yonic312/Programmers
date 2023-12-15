import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) { // solution이라는 함수 안에 (매개변수)
        Arrays.sort(numbers);
        int max = -100000001;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if(i == j)
                    continue;
                if(numbers[i] * numbers[j] > max)
                    max = numbers[i] * numbers[j];
            }
        }
        return max;
    }
}