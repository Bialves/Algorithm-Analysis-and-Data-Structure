package pesquisa;

public class BinarySearch {
  public int search(int[] array, int element) {
    return search(array,element,0,array.length-1);
  }
  
  private int search(int[] arr, int element, int low, int high) {
    if (low > high) {
      return -1;
    }
    // Define o mid
    int mid = (low + high) / 2;
    // Chamada recursiva
    if (arr[mid] < element) {
      /* Se mid é menor que o elemento da busca,
       * high atualiza (delimita área de busca)
       */
      return search(arr,element,mid+1,high);
    } 
    else if (arr[mid] > element) {
      /* Se mid é maior que o elemento da busca,
       * low atualiza (delimita área de busca)
       */
      return search(arr,element,low,mid-1);
    } 
    else { 
      /* Se mid não é maior e nem manor que o,
       * elemento da busca, é porque mid é igual
       * ao elemento
       */
      return arr[mid];
    }
  } 
}
