class Solution {
    public int solution(String[] spell, String[] dic) { // solution이라는 함수 안에 (매개변수)
        int cnt = 2;
        boolean isTrue = false;

        for (int i = 0; i < dic.length; i++) {
            if(dic[i].length() != spell.length)
               continue;

            for (String str : spell) {
                if (!dic[i].contains(str)) {
                    isTrue = false;
                    break;
                } else {
                    isTrue = true;
                }
            }
            if (isTrue) {
                cnt = 1;
                break;
            }
        }
        return cnt;
    }
}