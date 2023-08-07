package classificacao;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {
    int array[] = {11,7,9,10,5,6,2};
    System.out.println("> Before: " + Arrays.toString(array));
    System.out.println("> After Algorithms:");

    BubbleSort bubble = new BubbleSort();
    bubble.sort(array);
    System.out.print("[BUBBLE SORT] Sorted array: ");
    System.out.println(Arrays.toString(array));

    // ========================================================

    InsertionSort insert = new InsertionSort();
    insert.sort(array);
    System.out.print("[INSERTION SORT] Sorted array: ");
    System.out.println(Arrays.toString(array));

    // ========================================================

    MergeSort merge = new MergeSort();
    merge.sort(array,0,array.length - 1);
    System.out.print("[MERGE SORT] Sorted array: ");
    System.out.println(Arrays.toString(array));

    // ========================================================

    QuickSort quick = new QuickSort();
    quick.sort(array,0,array.length - 1);
    System.out.print("[QUICK SORT] Sorted array: ");
    System.out.println(Arrays.toString(array));

  }
}
