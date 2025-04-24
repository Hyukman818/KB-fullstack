package test;

public class Array3 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83,92,96},
                {78, 83, 93, 87, 88}
        };

        int sumAll = 0;

        for(int i=0;i<array.length;i++){
            double avg = 0;
            for(int j=0;j<array[i].length;j++){
                sumAll += array[i][j];
                avg += array[i][j];
            }
            avg = avg/array[i].length;
            System.out.println(avg);
        }
        System.out.println("sumAll : "+sumAll);
    }
}
