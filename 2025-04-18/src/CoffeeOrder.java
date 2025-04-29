import java.util.Scanner;

public class CoffeeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("음료를 선택하세요: 1.아메리카노, 2.카페라떼, 3.카푸치노");
        int drink = scanner.nextInt();
        int basePrice;
        switch (drink) {
            case 1:
                basePrice = 3000;
                break;
            case 2:
                basePrice = 4000;
                break;
            case 3:
                basePrice = 4500;
                break;
            default:
                System.out.println("지원하지 않는 음료 종류입니다.");
                scanner.close();
                return;
        }

        System.out.println("크기를 선택하세요: 1.Small, 2.Medium, 3.Large");
        int size = scanner.nextInt();
        int sizePrice;
        switch (size) {
            case 1:
                sizePrice = 0;
                break;
            case 2:
                sizePrice = 500;
                break;
            case 3:
                sizePrice = 1000;
                break;
            default:
                System.out.println("잘못된 크기 선택입니다.");
                scanner.close();
                return;
        }

        System.out.println("옵션을 선택하세요: 1.기본, 2.샷추가, 3.시럽추가, 4.샷,시럽추가");
        int option = scanner.nextInt();
        int optionPrice;
        switch (option) {
            case 1:
                optionPrice = 0;
                break;
            case 2:
                optionPrice = 500;
                break;
            case 3:
                optionPrice = 300;
                break;
            case 4:
                optionPrice = 800;
                break;
            default:
                System.out.println("잘못된 옵션 선택입니다.");
                scanner.close();
                return;
        }

        int totalPrice = basePrice + sizePrice + optionPrice;
        System.out.println("최종 가격은 " + totalPrice + "원입니다.");

        scanner.close();
    }
}
