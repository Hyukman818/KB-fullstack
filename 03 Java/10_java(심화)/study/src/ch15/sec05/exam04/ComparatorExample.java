package ch15.sec05.exam04;

import java.util.TreeSet;

public class ComparatorExample {
    public static void main(String[] args) {
        TreeSet<Fruit> fruits = new TreeSet<>(new FruitComparator());
        fruits.add(new Fruit("Grape", 3000));
        fruits.add(new Fruit("Watermelon", 10000));
        fruits.add(new Fruit("Strawberry", 6000));

        for (Fruit f : fruits) {
            System.out.println(f.name + ", " + f.price);
        }
    }
}
