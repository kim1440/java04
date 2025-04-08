import java.util.Scanner;

public class Main {
    int kor = 0;
    int eng = 0;
    int mat = 0;
    int sci = 0;
    int sum = 0;
    int intAvg = 0;
    double doubleAvg = 0.0;
    boolean boolAvg = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 점수를 입력하세요.: ");
        int kor = sc.nextInt();
        System.out.print("영어 점수를 입력하세요.: ");
        int eng = sc.nextInt();
        System.out.print("수학 점수를 입력하세요.: ");
        int mat = sc.nextInt();
        System.out.print("과학 점수를 입력하세요.: ");
        int sci = sc.nextInt();

        int sum = kor + eng + mat + sci;
        int intAvg = sum / 4;
        double doubleAvg = (double) sum / 4;
        boolean boolAvg = (intAvg == doubleAvg);

        System.out.println("총점: " + sum);
        System.out.println("정수 평균: " + intAvg);
        System.out.println("실수 평균: " + doubleAvg);
        System.out.printf("실수 평균 (소수점 둘째 자리): %.2f\n", doubleAvg);
        if (boolAvg) {
            System.out.println("정수 평균과 실수 평균은 같습니다.");
        } else {
            System.out.println("정수 평균과 실수 평균은 다릅니다.");
        }
    }
}