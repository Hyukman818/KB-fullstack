package ch04.sec02;

public class IfNestedExample {
    public static void main(String[] args) {
        int score = (int)(Math.random()*20 + 81); // 81~100 구간의 랜덤한 점수
        System.out.println("점수: " + score);

        String grade = "";

        if(score >= 81) {
            grade = "B";
            if(score >= 85) {
                grade="B+";
                if(score >= 90) {
                    grade="A";
                    if(score >= 95 && score <= 100) {
                        grade="A+";
                    }
                }
            }
        }

        System.out.println("학점: " + grade);
    }
}
