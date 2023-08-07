import java.util.Arrays;

import classificacao.BubbleSort;
import classificacao.InsertionSort;

public class Main {
    public static void main(String[] args) throws Exception {
        BubbleSort bubble = new BubbleSort();

        int array1[] = {4, 2, 3, 1};
        bubble.sort(array1);
        System.out.print("[BUBBLE SORT] Sorted array: ");
        System.out.println(Arrays.toString(array1));

        // ========================================================

        InsertionSort insert = new InsertionSort();

        int array2[] = {11,7,9,10,5,6,2};
        insert.sort(array2);
        System.out.print("[INSERTION SORT] Sorted array: ");
        System.out.println(Arrays.toString(array2));

    }
}
