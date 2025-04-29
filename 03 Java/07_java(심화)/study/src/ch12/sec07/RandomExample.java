package ch12.sec07;
import java.util.*;

public class RandomExample {
    public static void main(String[] args) {
        int[] selectNum = new int[6];
        int[] winningNum = new int[6];

        Random rand = new Random();

        System.out.print("선택한 번호 :");
        for (int i = 0; i < selectNum.length; i++) {
            // 증복된 숫자에 대해 예외처리 어떻게 할지 고민하자

            selectNum[i] = rand.nextInt(45)+1;
            System.out.print(" " + selectNum[i]);
        }

        System.out.println();
        System.out.print("당첨 번호 :");

        for (int i = 0; i < winningNum.length; i++) {
            // 증복된 숫자에 대해 예외처리 어떻게 할지 고민하자

            winningNum[i] = rand.nextInt(45)+1;
            System.out.print(" " + winningNum[i]);
        }

        System.out.println();
        System.out.println();

        Arrays.sort(selectNum);
        Arrays.sort(winningNum);

        System.out.print("당첨 여부: ");
        if(Arrays.equals(selectNum, winningNum)) {
            System.out.println("당첨이다!!");
        }
        else {
            System.out.println("아쉽게도 당첨되지 않았습니다.");
        }

    }
}
