package classificacao;

public class InsertionSort {
   public void sort(int[] array) {
      for (int index=1; index<array.length; index++) {
			int key = array[index]; // 'key' recebe o elemento a ser utilizado como chave nas comparações
			int j = index - 1; // 'j' manipula o array, por meio de seus índices

			/* Compare a chave com cada elemento à esquerda até que um
			 * elemento menor que ele é encontrado.
			 * Em ordem decrescente, altere key<array[j] para key>array[j].
			 */
			while (j >= 0 && key < array[j]) {
				array[j + 1] = array[j];
				--j;
			}

			// Atualize o array, colocando a chave depois do elemento menor que ele.
			array[j + 1] = key;
   	}	
  	}
}
