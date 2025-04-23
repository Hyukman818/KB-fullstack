package ch02.sec13;

import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("x값 입력: ");
        String strX = sc.nextLine();
        int x = Integer.parseInt(strX);

        System.out.print("y값 입력: ");
        String strY = sc.nextLine();
        int y = Integer.parseInt(strY);

        System.out.printf("x+y: %d\n",x+y);
        System.out.println();

        while(true){
            System.out.print("입력 문자열: ");
            String str = sc.nextLine();
            if(str.equals("q")) break;
            else{
                System.out.printf("출력 문자열: %s\n",str);
                System.out.println();
            }
        }

        System.out.println("종료");


    }
}
