package ch07.sec03.exam02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("갤럭시","초록색");

        // Phone으로부터 상속받은 내용
        System.out.println(myPhone.model);
        System.out.println(myPhone.color);
    }
}
