package ch11.sec05;

public class ThrowsExample1 {
    public static void main(String[] args) {
        try {
            findClass();
        } catch(ClassNotFoundException e) { // 해당 클래스가 존재하지 않으면 예외처리
            System.out.println("예외 처리: " + e.toString());
        }
    }

    public static void findClass() throws ClassNotFoundException{
        // catch문에서 이쪽으로 던진 예외처리문
        Class.forName("java.lang.String2");
    }
}
