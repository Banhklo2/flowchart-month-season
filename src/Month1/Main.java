package Month1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("해당 월을 입력하시오. : ");
            int month = sc.nextInt();

            if (month == 0) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            if (month < 1 || month > 12) {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            switch (month) {
                case 3, 4, 5:
                    System.out.println("봄");
                    break;
                case 6, 7, 8:
                    System.out.println("여름");
                    break;
                case 9, 10, 11:
                    System.out.println("가을");
                    break;
                case 12, 1, 2:
                    System.out.println("겨울");
                    break;
            }
            break;
        }
        sc.close();
    }
}
