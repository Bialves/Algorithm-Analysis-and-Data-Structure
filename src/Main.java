import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BubbleSort bubble = new BubbleSort();

        int array[] = {4, 2, 3, 1};
        bubble.sort(array);
        System.out.print("Sorted array: ");
        System.out.println(Arrays.toString(array));
    }
}
