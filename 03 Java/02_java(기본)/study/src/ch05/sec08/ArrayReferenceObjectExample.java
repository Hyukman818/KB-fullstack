package ch05.sec08;

public class ArrayReferenceObjectExample {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "Java";
        strArray[1] = "Java";
        strArray[2] = new String("Java");

        System.out.println( strArray[0] == strArray[1] ); // 같은 값을 가지면 기본적으로 주소가 같다
        System.out.println( strArray[0] == strArray[2] ); // new로 array를 생성한 순간 주소는 달라진다
        System.out.println( strArray[0].equals(strArray[2]) ); // 주소는 다르더라도 값은 같다
    }
}
