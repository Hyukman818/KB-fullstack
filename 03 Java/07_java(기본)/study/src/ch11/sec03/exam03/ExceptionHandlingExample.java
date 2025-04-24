package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
            String[] array = {"100", "1oo"};

        try {
            for(int i=0; i<=array.length; i++) {
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "]: " + value);
            }
        } catch (ArrayIndexOutOfBoundsException e) { // array[2]인 경우는 존재하면 안되니까 예외처리
            System.out.println("숫자로 변환할 수 없음: " + e.getMessage());
            // throw new RuntimeException(e);
        } catch (NumberFormatException e) { // array[1]의 "1oo"는 int형이 아니기 때문에 예외처리
            System.out.println(e.getMessage());
        }
    }
}
