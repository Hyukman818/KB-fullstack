package test;

public class Test2 {
    public static void main(String[] args) {
        char ch = '*';
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
        System.out.println();

        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
