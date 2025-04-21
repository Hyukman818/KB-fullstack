package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child; // 부모 타입으로 자동 형변환

        parent.method1(); // parent의 메서드
        parent.method2(); // 상속됐기 때문에 child의 메서드
        // parent.method3();
        // parent 타입으로 형변환 했기 때문에
        // 부모 클래스에 있는 필드와 메서드만 접근 가능
    }
}
