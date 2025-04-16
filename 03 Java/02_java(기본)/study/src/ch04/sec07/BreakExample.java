package ch04.sec07;

import java.util.Random;

public class BreakExample {
    public static void main(String[] args) {
        
        int randomNumber;
        
        while(true){
            randomNumber = (int)(Math.random()*6)+1;
            System.out.println(randomNumber);
            if(randomNumber == 6){
                System.out.println("프로그램 종료");
                break;
            }
        }
        
    }
}
