import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 (0 ~ 100): ");
        int score = scanner.nextInt();

        int gradeKey = (score >= 0 && score <= 100) ? (score / 10) : -1;

        switch (gradeKey) {
            case 10:
            case 9:
                System.out.println("A학점");
                break;
            case 8:
                System.out.println("B학점");
                break;
            case 7:
                System.out.println("C학점");
                break;
            case 6:
                System.out.println("D학점");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F학점");
                break;
            default:
                System.out.println("잘못된 점수입니다.");
        }

        scanner.close();
    }
}
