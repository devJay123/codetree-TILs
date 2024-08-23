import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String tmp;
        if (n < 0) {
            tmp = "ice";
        } else if (n >= 100) {
            tmp = "vapor";
        } else {
            tmp = "water";
        }

        System.out.print(tmp);
    }
}