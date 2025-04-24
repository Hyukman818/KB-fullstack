package ch14.sec03.exam02;

import java.awt.Toolkit;

// 두 작업을 동시에 출력하고 싶은 경우
// 둘 중 하나는 '작업스레드'에서 처리해야 함.

public class BeepPrintExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    Toolkit.getDefaultToolkit().beep(); // 삡 소리 출력 구문
                    System.out.println("삡 소리를 냈습니다.");

                    try {
                        Thread.sleep(500);
                        // 이 줄은 **checked exception인 InterruptedException**을
                        // 발생시킬 수 있기 때문에, 예외 처리를 반드시 해줘야 합니다.
                    } catch (Exception e) {
                        System.out.println("예외 발생!!");
                    }
                }
            }
        });

        t1.start();
        // Runnable 인터페이스에 작성한 코드는 직접 start()를 해줘야 작동함

        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500); // 0.5초씩 정지시켜줌
            } catch (Exception e) {
                System.out.println("띵 출력 중에 오류 발생...");
            }
        }



//        for(int i = 0; i<10; i++){
//            Toolkit.getDefaultToolkit().beep(); // 삡 소리 출력 구문
//
//            try {
//                Thread.sleep(500);
//                // 이 줄은 **checked exception인 InterruptedException**을
//                // 발생시킬 수 있기 때문에, 예외 처리를 반드시 해줘야 합니다.
//            } catch (Exception e) {
//                System.out.println("예외 발생!!");
//            }
//        }
//
//        System.out.println();
//
//        for(int i = 0; i<10; i++){
//            System.out.println("띵");
//            try {
//                Thread.sleep(500); // 0.5초씩 정지시켜줌
//            } catch (Exception e) {
//                System.out.println("띵 출력 중에 오류 발생...");
//            }
//        }

    }
}
