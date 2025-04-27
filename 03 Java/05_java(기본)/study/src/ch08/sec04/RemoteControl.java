package ch08.sec04;

public interface RemoteControl {
    // 인터페이스에서 상수 변수를 등록할 때는 전부 대문자로 씀
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);
}
