package ch07.sec07.exam01;

class A {
}
class B extends A {
}
class C extends A {
}
class D extends B {
}
class E extends C {
}

public class PromotionExample {
    public static void main(String[] args ){
        B b=new B();
        C c=new C();
        D d=new D();
        E e=new E();

        A a1 = b;
        A a2 = c;
        A a3 = d;
        A a4 = e;

        B b1 = d;
        C c1 = e;

        // B b3 = e;
        // C c2 = d;
        // A-B-D / A-C-E 순서로 자식 계층이 내려간다.
        // B와 E, C와 D처럼 서로 자손관계가 아니면,
        // 강제 형변환을 하는게 아닌 이상, 자동 형변환은 불가능하다.
    }
}
