import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        String str;
        if (a >= 1.0) {
            str = "High";
        } else if (a >= 0.5) {
            str = "Middle";
        } else {
            str = "Low";
        }

        System.out.print(str);
    }
}