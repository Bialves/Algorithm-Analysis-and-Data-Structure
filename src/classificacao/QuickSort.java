package classificacao;

public class QuickSort {
  // Método para localizar a posição da partição
  private int partition(int array[], int low, int high) {
    // Escolhe o elemento mais à direita como Pivot
    int pivot = array[high];
    // Ponteiro para elemento maior
    int i = (low - 1);
    // Atravessa todos os elementos comparando cada um com o pivô
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        /* Se for encontrado um elemento menor que o pivô, 
         * troque-o pelo elemento maior apontado por i
         */
        i++;

        // Trocando elemento em i por elemento em j
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    // Troque o elemento Pivot pelo elemento maior especificado por i
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    // Retorna a posição de onde a partição é feita
    return (i + 1);
  }

  public void sort(int array[], int low, int high) {
    if (low < high) {
      /* Localiza o elemento pivô, tal que elementos menores que o
       * pivô estão à esquerda e elementos maiores que pivô estão à direita
       */
      int pi = partition(array, low, high);
      
      // Chamada recursiva à esquerda do pivô
      sort(array, low, pi - 1);

      // Chamada recursiva à direita do pivô
      sort(array, pi + 1, high);
    }
  }
}
