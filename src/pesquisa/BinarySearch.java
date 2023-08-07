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
      return search(arr,element,mid+1,high);
    } 
    else if (arr[mid] > element) {
      return search(arr,element,low,mid-1);
    } 
    else {
      return mid; // Encontrou o elemento no array
    }
  } 
}
