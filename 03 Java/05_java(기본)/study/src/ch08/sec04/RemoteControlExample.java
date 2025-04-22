package ch08.sec04;

public class RemoteControlExample {
    public static void main(String[] args) {
        int volume = 5;

        RemoteControl rc;

        rc = new Television();
        rc.turnOn();
        rc.setVolume(volume);
        rc.turnOff();

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(volume);
        rc.turnOff();
    }
}
