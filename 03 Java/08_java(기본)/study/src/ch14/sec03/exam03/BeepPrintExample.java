package ch14.sec03.exam03;

import java.awt.Toolkit;

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Toolkit.getDefaultToolkit().beep();
                    try {
                        Thread.sleep(500);
                        System.out.println("삡! 소리 출력");
                    } catch (Exception e) {
                        System.out.println("삡 소리 출력 중 오류 발생!!");
                    }
                }
            }
        };

        t1.start();

        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
                System.out.println("띵");
            } catch (Exception e) {
                System.out.println("띵 출력 중 오류 발생!!");
            }
        }
    }
}
