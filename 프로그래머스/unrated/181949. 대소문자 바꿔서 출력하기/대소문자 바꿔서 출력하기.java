import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        int[] arr = new int[a.length()];
        for (int i = 0; i < a.length(); i++) {
            if ((int)a.charAt(i) >= 97){
                arr[i] = ((int)a.charAt(i) - 32);
            } else {
                arr[i] = ((int)a.charAt(i) + 32);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print((char)arr[i]);
        }
    }
}
