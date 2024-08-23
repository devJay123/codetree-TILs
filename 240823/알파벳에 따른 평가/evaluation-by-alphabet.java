import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans;
        if (s.equals("S")) {
            ans = "Superior";
        } else if (s.equals("A")) {
            ans = "Excellent";
        } else if (s.equals("B")) {
            ans = "Good";
        } else if (s.equals("C")) {
            ans = "Usually";
        } else if (s.equals("D")) {
            ans = "Effort";
        } else {
            ans = "Failure";
        }

        System.out.print(ans);
    }
}