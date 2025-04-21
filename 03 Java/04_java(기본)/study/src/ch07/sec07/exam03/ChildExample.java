package ch07.sec07.exam03;

public class ChildExample {
    public static void main(String[] args) {
        Parent parent = new Parent();

        parent.field1 = "data1";
        parent.method1();
        parent.method2();
        // 아래 두 항목은 부모 영역에 원래 없던 필드라서 접근이 불가능하다.
        // parent.field2 = "data2";
        // parent.method3();

        Child child = (Child) parent; // 강제 형변환 이후에는 사용 가능

        child.field2 = "data2";
        child.method3();
    }
}
