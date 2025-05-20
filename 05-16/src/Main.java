import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = -1;
        for (int i = 0; i < 10; i++) {
            System.out.print(i + "번째 입력 " + i + ": ");
            number = scanner.nextInt();
            if (number >= 0 && number <= 100) {
                break;
            }
            System.out.println("다시 입력하세요");
        }
        System.out.println("입력 받은 숫자: " + number);
    }
}
