class Solution {
    public int[] solution(int[] numbers, String direction) { // solution이라는 함수 안에 (매개변수)
        int[] result = new int[numbers.length];
        int cnt = 0;

        if(direction.equals("left")) {
            for (int i = 1; i < numbers.length; i++) {
                result[cnt++] = numbers[i];
            }
            result[numbers.length-1] = numbers[0];
        } else if(direction.equals("right")) {
            cnt = 1;
            result[0] = numbers[numbers.length-1];
            for (int i = 0; i < numbers.length-1; i++) {
                result[cnt++] = numbers[i];
            }
        }
        return result;
    }
}