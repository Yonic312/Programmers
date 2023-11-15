class Solution {
    public int solution(int num1, int num2) {
        double result = ((double) num1 / (double) num2)* 1000; // double과 Double은 다르다
        return (int)result;
    }
}