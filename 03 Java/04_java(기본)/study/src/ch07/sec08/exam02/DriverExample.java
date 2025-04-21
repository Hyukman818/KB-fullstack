package ch07.sec08.exam02;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();

        Bus bus = new Bus();
        driver.drive(bus);
        // bus.run(); // 이렇게 해도 같은 결과가 나오지만, 클래스들을 전부 이용하는 문제임
        Taxi taxi = new Taxi();
        driver.drive(taxi);
        // taxi.run();


        // 어떤 식으로 상속 받는지 대충 알 수 있었다.
    }
}
