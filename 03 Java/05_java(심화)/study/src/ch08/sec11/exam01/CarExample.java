package ch08.sec11.exam01;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.run();

        // 기본값으로 HankookTire 인스턴스로 정의했으므로
        // 두번째 호출할 때는 KumhoTire로 변경해줌
        myCar.tire1 = new KumhoTire();
        myCar.tire2 = new KumhoTire();
        myCar.run();
    }
}
