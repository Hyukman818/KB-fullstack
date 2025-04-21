package ch07.sec07.exam03;

public class Child extends Parent {
    public String field2; // 부모의 필드 field1도 상속받음 => 필드 : 2개


    // 상속받은 메서드 2개 포함해서 => 메서드 : 3개
    public void method3() {
        System.out.println("Child Child-method3()");
    }
}
