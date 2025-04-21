package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        double r = 20;

        Computer computer = new Computer(); // pi 값으로 Math.PI 이용
        System.out.println("Computer 클래스 계산값 : " + computer.areaCircle(r));

        Calculator calculator = new Calculator(); // pi 값으로 3.14159 이용
        System.out.println("Calculator 클래스 계산값 : " + calculator.areaCircle(r));
    }
}
