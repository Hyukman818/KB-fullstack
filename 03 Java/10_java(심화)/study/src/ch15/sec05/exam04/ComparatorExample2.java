package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample2 {
    public static void main(String[] args) {
        TreeSet<Fruit> fruits = new TreeSet<>(new FruitComparator(){
            public int compare(Fruit f1, Fruit f2) {
                return Integer.compare(f1.price, f2.price);
            }
        });
    }
}
