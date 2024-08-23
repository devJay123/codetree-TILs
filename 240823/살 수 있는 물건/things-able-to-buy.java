import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str;
        if (n - 3000 >= 0) {
            str = "book";
        } else if (n-1000 >=0) {
            str = "mask";
        } else {
            str = "no";
        }

        System.out.print(str);
    }
}