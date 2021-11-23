package example;

import java.util.Arrays;

public class ArrProcessor {
    private int[] arr;

    ArrProcessor(int[] arr) {
        this.arr = Arrays.copyOf(arr, arr.length);
    }

    public void square() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }

    public String toString() {
        return Arrays.toString(arr);
    }
}
