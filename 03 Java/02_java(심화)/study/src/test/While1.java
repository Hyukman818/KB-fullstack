package test;

import java.util.Scanner;

public class While1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;
        boolean run = true; // 얘 없이 while(true)로 해버리니까 빠져나올 방법이 없어짐

        while (run) {
            System.out.println("-------------------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("-------------------------------");
            System.out.print("선택> ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.print("예금액>");
                    balance += Integer.parseInt(sc.nextLine());
                    break;
                case 2:
                    System.out.print("출금액>");
                    balance -= Integer.parseInt(sc.nextLine());
                    break;
                case 3:
                    System.out.print("잔고>");
                    System.out.println(balance);
                    break;
                case 4:
                    run = false;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
