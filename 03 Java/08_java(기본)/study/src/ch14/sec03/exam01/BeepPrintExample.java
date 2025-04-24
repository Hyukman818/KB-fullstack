package ch14.sec03.exam01;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            Toolkit.getDefaultToolkit().beep(); // 삡 소리 출력 구문

            try {
                Thread.sleep(500);
                // 이 줄은 **checked exception인 InterruptedException**을
                // 발생시킬 수 있기 때문에, 예외 처리를 반드시 해줘야 합니다.
            } catch (Exception e) {
                System.out.println("예외 발생!!");
            }
        }

        System.out.println();

        for(int i = 0; i<10; i++){
            System.out.println("띵");
            try {
                Thread.sleep(500); // 0.5초씩 정지시켜줌
            } catch (Exception e) {
                System.out.println("띵 출력 중에 오류 발생...");
            }
        }

    }
}
