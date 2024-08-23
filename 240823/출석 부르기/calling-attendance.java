import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;
        if (n == 1) {
            str = "John";
        }else if (n ==2) {
            str = "Tom";
        }else if (n==3) {
            str = "Paul";
        } else {
            str = "Vacancy";
        }

        System.out.print(str);
    }
}