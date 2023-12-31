package classificacao;

public class MergeSort {
  // Mescla duas submatrizes de arr (L e M)
  private void merge(int[] arr, int p, int q, int r) {

    // Cria L ← arr[p..q] e M ← arr[q+1..r]
    int n1 = q - p + 1;
    int n2 = r - q;

    int[] L = new int[n1];
    int[] M = new int[n2];

    // Organiza os elementos de arr nas duas submatrizes
    for (int i=0; i < n1; i++) {
      L[i] = arr[p + i];
    }
    
    for (int j=0; j < n2; j++) {
      M[j] = arr[q + 1 + j];
    }
    
    // Mantém o índice atual da submatriz e arr
    int i, j, k;
    i = 0;
    j = 0;
    k = p;

    /* Até chegarmos a qualquer extremidade de L ou M, escolha o maior entre
     * os elementos de L e M e coloque-os na posição correta em arr[p.. r]
     */
    while (i < n1 && j < n2) {
      if (L[i] <= M[j]) {
        arr[k] = L[i];
        i++;
      } else {
        arr[k] = M[j];
        j++;
      }
      k++;
    }

    /* Quando ficarmos sem elementos em L ou M, pegue os 
     * elementos restantes e coloque em arr[p.. r]
     */
    while (i < n1) {
      arr[k] = L[i];
      i++;
      k++;
    }

    while (j < n2) {
      arr[k] = M[j];
      j++;
      k++;
    }
  }

  // Divide o array em duas submatrizes, a serem classificadas e mescladas
  private void sort(int arr[], int low, int high) {
    if (low < high) {
      // mid é o ponto onde o array é dividido em duas submatrizes
      int mid = (low + high) / 2;
      // Chamada recursiva
      sort(arr, low, mid);
      sort(arr, mid + 1, high);

      // Mescla as submatrizes para classificar
      merge(arr, low, mid, high);
    }
  }

  public void sort(int[] array) {
    // Sobrecarga
    sort(array,0,array.length - 1);
  }
}
