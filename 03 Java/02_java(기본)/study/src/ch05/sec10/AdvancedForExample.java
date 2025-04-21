package ch05.sec10;

public class AdvancedForExample {
    public static void main(String[] args) {
        int[] scores = {95, 71, 84, 93, 87};

        int sum = 0;
        double avg =0;
        for(int score : scores){
            sum+= score;
        }
        avg=sum/scores.length;

        System.out.println(sum);
        System.out.println(avg);
    }
}
