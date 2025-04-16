package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null; // intArray를 배열로 참조해야 6번째 줄이 말이 됨
        intArray[0] = 10;

        String str = null;
        System.out.println("총 문자 수: " + str.length() );
        // str이라는 문자열은 아무값도 참조하지 않기 때문에 출력 자체가 말이 안 됨
    }
}
