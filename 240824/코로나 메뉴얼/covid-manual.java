import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a_cold, b_cold, c_cold;
        int a_tem, b_tem, c_tem;

        a_cold = sc.next();
        a_tem = sc.nextInt();
        b_cold = sc.next();
        b_tem = sc.nextInt();
        c_cold = sc.next();
        c_tem = sc.nextInt();

        if (a_cold.charAt(0) == 'Y' && a_tem >= 37) {
            if (b_cold.charAt(0) == 'Y' && b_tem >= 37) {
                System.out.println("E");
            } else if (c_cold.charAt(0) == 'Y' && c_tem >= 37) {
                System.out.println("E");
            } else {
                System.out.println("N");
            }
        } else if (b_cold.charAt(0) == 'Y' && b_tem >= 37) {
            if (c_cold.charAt(0) == 'Y' && c_tem >= 37) {
                System.out.println("E");
            } else {
                System.out.println("N");
            }
        } else {
            System.out.println("N");
        }

    }
}