package test;

import java.util.Scanner;

public class While2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int studentNum = 0;
        int[] scores = new int[studentNum];
        int bestScore = 0;
        double avg = 0;

        while (run) {
            System.out.println("---------------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 종료");
            System.out.println("---------------------------------");

            System.out.print("선택> ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("학생수> ");
                    studentNum = sc.nextInt();
                    break;
                case 2:

                    scores = new int[studentNum];
                    for (int i = 0; i < studentNum; i++) {
                        System.out.printf("scores[%d]> ", i);
                        scores[i] = sc.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i < studentNum; i++) {
                        System.out.printf("scores[%d]> %d", i, scores[i]);
                        System.out.println();
                    }
                    break;
                case 4:
                    bestScore = scores[0];
                    for (int i = 0; i < studentNum; i++) {
                        avg += scores[i];
                        if (scores[i] > bestScore) {
                            bestScore = scores[i];
                        }
                    }
                    avg /= (double) studentNum;
                    System.out.printf("최고 점수: %d\n", bestScore);
                    System.out.printf("평균 점수: %.1f\n",avg);
                    break;
                case 5:
                    run = false;
                    break;
            }

        }
        System.out.println("프로그램 종료");


    }
}
