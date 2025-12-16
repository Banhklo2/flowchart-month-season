package Month;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Month month = new Month();

        System.out.println("해당 월을 입력하시요: ");
        int monthInput = sc.nextInt();

        if (monthInput < 1 || monthInput > 12) {
            System.out.println("잘못된 입력입니다!");
            return;
        }

        month.setMonth(monthInput);
        System.out.println("계절: ");
        month.printSeason();

        sc.close();
    }
}
