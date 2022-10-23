package me.devksh930.lec17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lec17MainJdk8efore {
    public static void main(String[] args) {
        List<Fruit> fruits = Arrays.asList(new Fruit("사과", 1_000),
                new Fruit("사과", 1_200),
                new Fruit("사과", 1_000),
                new Fruit("사과", 1_500),
                new Fruit("바나나", 3_000),
                new Fruit("바나나", 3_200),
                new Fruit("바나나", 2_500),
                new Fruit("수박", 10_000)
        );
        filterFruits(fruits, new FruitFilter() {
            @Override
            public boolean isSelected(Fruit fruit) {
                return Arrays.asList("사과", "바나나").contains(fruit.getName()) && fruit.getPrice() > 5_000;
            }
        });
    }

    private static List<Fruit> filterFruits(List<Fruit> fruits, FruitFilter fruitFilter) {
        List<Fruit> results = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruitFilter.isSelected(fruit)) {
                results.add(fruit);
            }
        }
        return results;
    }

}
