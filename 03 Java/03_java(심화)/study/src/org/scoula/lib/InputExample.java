package org.scoula.lib;

public class InputExample {
    public static void main(String[] args) {
        Input input = new Input();

        String name = input.read("이름: ");
        System.out.println("입력값: " + name);

        String name2 = input.read("이름", "홍길동");
        System.out.println("입력값: " + name2);

        int age = input.readInt("나이: ");
        System.out.println("입력값: " + age);

        boolean bool = input.confirm("종료할까요?", true);
        System.out.println("입력값: " + bool);

        boolean bool2 = input.confirm("종료할까요?");
        System.out.println("입력값: " + bool2);
    }
}
