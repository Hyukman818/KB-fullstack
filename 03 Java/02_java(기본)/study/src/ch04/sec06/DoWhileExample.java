package ch04.sec06;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("메시지를 입력하세요.");
        System.out.println("프로그램을 종료하려면 q를 입력하세요.");
        String input = "";
        do{
            System.out.print(">");
            input = scanner.nextLine();

            System.out.println(input);
        }while(!input.equals("q")); // q를 입력하면 반복문 종료


        System.out.println("프로그램 종료");
    }
}
