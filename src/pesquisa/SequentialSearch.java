package pesquisa;

public class SequentialSearch {
  public int search(int[] array, int element) {
    for (int i=0; i<array.length; i++) {
      if (array[i] == element) { // Se o elemento está no array
        return array[i]; // ele é retornado
      }
    }
    return -1; // Sinalização de ERRO
  }
}
