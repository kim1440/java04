import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.print("점수를 입력하세요 (종료하려면 음수를 입력): ");
            if (!sc.hasNextInt()) {
                System.out.println("정수입력하세요");
                sc.next();
                continue;
            }
            int score = sc.nextInt();
            if (score < 0) {
                break;
            }
            total += score;
        }
        System.out.println("점수의 총합은:" + total);
        sc.close();
    }
}