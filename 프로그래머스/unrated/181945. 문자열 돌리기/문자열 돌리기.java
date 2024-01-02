import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        for (String str : str1.split("")) {
            System.out.println(str);
        }
    }
}