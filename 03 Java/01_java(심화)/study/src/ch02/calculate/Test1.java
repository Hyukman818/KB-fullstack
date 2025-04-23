package ch02.calculate;

public class Test1 {
    public static void main(String[] args) {
        int widthBottom = 10;
        int widthTop = 5;
        int height = 7;
        double area = 0;

        area = (widthBottom + widthTop)/(double)2 * height;
        System.out.println(area);
    }
}
