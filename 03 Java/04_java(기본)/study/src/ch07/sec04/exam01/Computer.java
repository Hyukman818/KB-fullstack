package ch07.sec04.exam01;

public class Computer extends Calculator{
    @Override
    public double areaCircle(double r) {
        System.out.println("Computer 객체의 areaCircle() 실행");
        // areaCircle()을 오버라이드 했지만 리턴값은 고유값으로 변경함 (리턴값이 달라짐)
        return Math.PI * r * r;
    }
}
