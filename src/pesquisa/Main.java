package pesquisa;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws Exception {
    int array[] = {2,5,6,7,9,10,11}; // Array ordenado (para o algoritmo de busca binária)
    System.out.println("> Array: " + Arrays.toString(array));
    System.out.println("> Search element: 5");

    BinarySearch binary = new BinarySearch();
    System.out.println("[BINARY] Return: " + binary.search(array, 5));

    // ========================================================
    SequentialSearch sequential = new SequentialSearch();
    System.out.println("[SEQUENCIAL] Return: " + sequential.search(array, 5));
  }
}
