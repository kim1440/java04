import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        System.out.print("정수 입력 : ");

        if (sc.hasNextInt()) {
            num = sc.nextInt();

            if (num >= 0 && num <= 100) {
                System.out.println(num + "0~100 사이의 정수입니다.");
            } else {
                System.out.println(num + "0~100 사이의 정수가 아닙니다.");
            }

        } else {
            System.out.println("유효한 정수가 아닙니다.");
        }

        sc.close();
    }
}
