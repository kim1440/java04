import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("좌석의 행 수를 입력하세요 : ");
        int row = sc.nextInt();

        System.out.println("좌석의 열 수를 입력하세요:");
        int cols = sc.nextInt();

        int[][] seats = new int[row][cols];

        while (true){
            System.out.println("\n좌석 예약을 진행하세요. (종료 하려면 0 0입력)");

            System.out.println("예약할 좌석의 행 번호 입력 (1~" + row + "): " );
            int r = sc.nextInt();
            System.out.println("예약할 좌석의 열 번호 입력(1~" + cols + "): ");
            int c = sc.nextInt();

            if (r == 0 && c == 0) {
                break;
            }

            if (r < 1 || row < 1 || c < 1 || c > cols) {
                System.out.println("잘못된 좌석 번호입니다. 다시 입력하세요.");
                continue;
            }

            int rowIndex = r - 1;
            int colIndex = c - 1;

            if (seats[rowIndex][colIndex] == 1) {
                System.out.println("이미 예약된 좌석입니다!");
            } else{
                seats[rowIndex][colIndex] = 1;
                System.out.println("좌석 예약이 완료되었습니다.");
            }
        }

        System.out.println("\n--- 현재 좌석 배치도 (0:비어있음, 1:예약됨) ---");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println();
        }
    }
}