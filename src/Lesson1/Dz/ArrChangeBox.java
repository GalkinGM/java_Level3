package Lesson1.Dz;

import java.util.Arrays;

public class ArrChangeBox<T> {
    private T x;
    private T [] arr;

    public ArrChangeBox(T... arr) {
        this.arr = arr;
    }

    public void Change(int i, int j) {
        System.out.println(Arrays.toString(arr));
        x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
        System.out.println(Arrays.toString(arr));

    }
}
