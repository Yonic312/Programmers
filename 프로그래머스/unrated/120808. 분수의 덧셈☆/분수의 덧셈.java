class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int denom = denom1 * denom2;
        int numer = (denom2 * numer1) + (denom1 * numer2);

        for (int i = numer - 1; i > 1; i--) {
            if (denom % i == 0 && numer % i == 0) {
                denom /= i;
                numer /= i;
            } // 기약변수 만들 때 여러 번 나눌 수 있으니 Break X
        }
        int[] result = {numer, denom};
        return result;
    }
}
