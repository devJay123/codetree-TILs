import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String str;
        int n = sc.nextInt();

        if (n >= 90) {
            str = "A";
        } else if(n >= 80) {
            str = "B";
        } else if(n>=70) {
            str = "C";
        }else if(n >= 60) {
            str = "D";
        } else {
            str = "F";
        }

        System.out.print(str);
    }
}