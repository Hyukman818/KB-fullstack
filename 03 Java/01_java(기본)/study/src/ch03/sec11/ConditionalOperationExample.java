package ch03.sec11;

public class ConditionalOperationExample {
    public static void main(String[] args) {
        int score = 85;
        // 90 초과: A, 80 초과: B, 나머지: C
        char grade = (score > 90) ? 'A' : ( (score > 80) ? 'B' : 'C' );
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
