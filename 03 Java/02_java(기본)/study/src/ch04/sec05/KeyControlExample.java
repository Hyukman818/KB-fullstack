package ch04.sec05;

import java.util.Scanner;

public class KeyControlExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int speed=0;

        while(run){
            System.out.println("-------------------------");
            System.out.println("1. 증속 | 2. 감속 | 3. 중지");
            System.out.println("-------------------------");
            System.out.print("선택: ");

            String choiceNum = scanner.nextLine();
            if(choiceNum.equals("1")){
                System.out.println("현재 속도 = "+ ++speed);
            }
            else if(choiceNum.equals("2")){
                System.out.println("현재 속도 = "+ --speed);
            }
            else if(choiceNum.equals("3")){
                System.out.println("프로그램 종료!");
                run = false;
            }
        }
    }
}
