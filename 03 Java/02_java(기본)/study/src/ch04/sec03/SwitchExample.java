package ch04.sec03;

public class SwitchExample {
    public static void main(String[] args) {
        int num = (int)(Math.random() * 6 + 1); // 1~6사이의 값 랜덤하게 선택

        switch (num){
            case 1: System.out.printf("%d번이 나왔습니다.", num); break;
            case 2: System.out.printf("%d번이 나왔습니다.", num); break;
            case 3: System.out.printf("%d번이 나왔습니다.", num); break;
            case 4: System.out.printf("%d번이 나왔습니다.", num); break;
            case 5: System.out.printf("%d번이 나왔습니다.", num); break;
            case 6: System.out.printf("%d번이 나왔습니다.", num); break;
        }
    }
}
