package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        ride(taxi);
        System.out.println();
        ride(bus);
    }

    public static void ride(Vehicle vehicle){
        if(vehicle instanceof Bus){
            // 이 객체가 Bus가 맞다면~ 아래 내용 실행
            Bus bus = (Bus)vehicle;
            bus.checkFare();
        }

        vehicle.run();
    }
}
