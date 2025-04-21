package ch05.sec09;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};
        int[] newIntArray = new int[5];


        for(int i=0;i<oldIntArray.length;i++){ // 3번 반복
            newIntArray[i]=oldIntArray[i];
        }
        for(int i=0;i<newIntArray.length;i++){ // 5번 반복
            System.out.printf("%d, ",newIntArray[i]);
        }
    }
}
