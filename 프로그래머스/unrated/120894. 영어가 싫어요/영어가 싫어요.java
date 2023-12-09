class Solution {
    public long solution(String numbers) { // solution이라는 함수 안에 (매개변수)
        String[] matchNumbers = {"zero", "one", "two", "three",
        "four", "five", "six","seven", "eight", "nine"};

        for (int i = 0; i < matchNumbers.length; i++) {
            numbers = numbers.replaceAll(matchNumbers[i], String.valueOf(i));
            //                           변환하고자 하는 대상, 변환할 문자 값
        }
        return Long.parseLong(numbers);
    }
}