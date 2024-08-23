import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int aMath, aEng;
        int bMath, bEng;
        aMath = sc.nextInt();
        aEng = sc.nextInt();
        bMath = sc.nextInt();
        bEng = sc.nextInt();

        if (aMath > bMath) {
            System.out.print("A");
        } else if (bMath < aMath) {
            System.out.print("B");
        } else if (aMath == bMath && aEng > bEng) {
            System.out.print("A");
        } else {
            System.out.print("B");
        }
    }
}