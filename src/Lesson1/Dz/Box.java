package Lesson1.Dz;

import java.util.ArrayList;

public class Box<T extends Fruits> {
    private ArrayList<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruitToAdd) {
        fruits.add(fruitToAdd);
    }

    public float getWeight() {
        return fruits.size() == 0 ? 0 : fruits.size() * fruits.get(0).getWeight();
    }

    // TODO: Сравнить сумму всех элементов двух списков
    public boolean compare(Box<?> otherBox) {
        //  ВНИМАНИЕ!!! использовать "==" только на целых числах
        //  return getWeight() == otherBox.getWeight();
        return (Math.abs(getWeight()-otherBox.getWeight())<0.000001f);
    }

    // TODO: добавление всех значений из одного списка в другой и очистка первого списка

    public void replaceAllFruitsToOtherBox(Box<T> otherBox) {
        otherBox.fruits.addAll(fruits);
        fruits.clear();
    }

}
