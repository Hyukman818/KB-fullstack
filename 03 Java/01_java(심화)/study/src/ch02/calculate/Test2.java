package ch02.calculate;

public class Test2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println((x>7) && (y<=5)); // T && T
        System.out.println((x%3 == 2) || (y%2 != 1)); // F || F
    }
}
