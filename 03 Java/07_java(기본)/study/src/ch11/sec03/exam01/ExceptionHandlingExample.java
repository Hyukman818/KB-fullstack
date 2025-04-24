package ch11.sec03.exam01;

// 예외처리 이전 코드!!!

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};
        for(int i=0; i<=array.length; i++) {
            int value = Integer.parseInt(array[i]);
            System.out.println("array[" + i + "]: " + value);
        }
    }
}
