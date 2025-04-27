package ch06.sec09;

public class CarExample {
    public static void main(String[] args) {
        Car car = new Car("벤틀리");

        car.run();
        // run()이 setSpeed()도 포함하고 있기 때문에 run()만 호출해줌
    }
}
