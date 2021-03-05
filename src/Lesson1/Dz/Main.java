package Lesson1.Dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // TODO: Написать метод, который меняет два элемента массива местами

        System.out.println("\n  Написать метод, который меняет два элемента массива местами\n");
        ArrChangeBox<String> fruits = new ArrChangeBox<>("apple", "orange", "lemon", "banana",
                "apricot", "avocado");
        ArrChangeBox<Integer> number = new ArrChangeBox<>(1, 2, 3, 4, 5);
        fruits.Change(0, 1);
        number.Change(0, 1);

        //TODO: Написать метод, который преобразует массив в ArrayList + метод который выводит один элемент

        System.out.println("\n\n  Написать метод, который преобразует массив в ArrayList + метод который выводит один элемент\n");


        String[] fruits1 = new String[]{"apple", "orange", "lemon", "banana",
                "apricot", "avocado"};
        Integer[] number1 = new Integer[]{1, 2, 3, 4, 5};
        System.out.println(asList(fruits1));

        List x = asList(number1);
        System.out.println(x);

        int y = (int) getListElement(x, 0);
        System.out.println(y);

        // TODO: Задача 3

        System.out.println("\n\n  Задача 3\n");

        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Orange o1 = new Orange();
        Orange o2 = new Orange();
        System.out.println("Вес одного Яблока: " + a1.getWeight());
        System.out.println("Вес одного Апельсина: " + o1.getWeight() + "\n");

        System.out.println("Добавим 3 яблока и 2 апельсина");

        appleBox1.addFruit(a1);
        appleBox1.addFruit(a2);
        appleBox1.addFruit(a3);
        orangeBox2.addFruit(o1);
        orangeBox2.addFruit(o2);

        System.out.println("\nвес в коробке с яблоками составил: " + appleBox1.getWeight());
        System.out.println("вес в коробке с апельсинами составил: " + orangeBox2.getWeight());

        System.out.println("Сравнение весов: " + appleBox1.compare(orangeBox2) + "\n");

        Box<Apple> appleBox2 = new Box<Apple>();

        System.out.println("Вес коробок с яблоками перед перемещением: ");
        System.out.println("appleBox1: " + appleBox1.getWeight());
        System.out.println("appleBox2: " + appleBox2.getWeight());

        appleBox1.replaceAllFruitsToOtherBox(appleBox2);

        System.out.println("\nВес коробок с яблоками после перемещения: ");
        System.out.println("appleBox1: " + appleBox1.getWeight());
        System.out.println("appleBox2: " + appleBox2.getWeight());

    }

//        List <Integer> gg = new ArrayList<>();
//        gg.addAll(Arrays.asList(1, 2, 3, 4, 5));
//
//        System.out.println(gg.get(2));

    public static <T> List<T> asList(T... arr) {
        ArrayList<T> ts = new ArrayList<T>(Arrays.asList(arr));
        return ts;
    }

    public static <A> A getListElement(List<A> list, int i) {
        return list.get(i);
    }

}







    //Преобразование массива в ArrayList
//        List<String> list1 = Arrays.asList(fruits1);
//        ArrayList<String> list2 = new ArrayList<>(Arrays.asList(fruits1));
//        System.out.println(list1 + "\n" + list2);


//        String [] fruits = new String[]{"apple", "orange", "lemon", "banana",
//                "apricot", "avocado"};
//        Main chFruits = new Main();
//        System.out.println(Arrays.toString(fruits));
//        chFruits.changeFruits(fruits, 2,4);
//
//    }

//    void changeFruits (String[] fruits, int i, int j){
//        String x = fruits[i];
//        fruits [i] = fruits [j];
//        fruits [j] = x;
//        System.out.println(Arrays.toString(fruits));
//    }
//}
//    "apple", "orange", "lemon", "banana",
//            "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
//            "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut",
//            "olive", "pea", "peanut", "pear", "pepper", "pineapple",
//            "pumpkin", "potato"