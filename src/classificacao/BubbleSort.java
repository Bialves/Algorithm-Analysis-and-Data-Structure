package classificacao;

public class BubbleSort {
	public void sort(int[] array) {
		boolean flag; // Validador de troca
		int aux; // Variavel auxiliar

		/* É utilizado 2 loops, sendo o mais externo usado para determinar
		* o tamanho do array e o 1º elemento utilizado na comparação (+ a esquerda).
		* O loop interno é usado para realizar a comparação, informando um 
		* 2º elemento (+ a direita), e identificar se o array está desordenado.
		*/
		for (int i=0; i<(array.length - 1); i++) {
			flag = false; // Validador inicializado
			for (int j = 0; j < array.length - 1; j++) {
				if(array[j] > array[j + 1]) { // Se o elemento atual é maior que o próximo (ex: 34 > 11)
					aux = array[j]; // Variavel auxiliar recebe o elemento maior
					array[j] = array[j + 1]; // Posição onde se encontrava o elemento maior, recebe o elemento menor
					array[j + 1] = aux; // Posição antiga do elemento menor, recebe o maior
					flag = true; // Validador é sinalizado de que houve uma troca
				}
			}

			/* Caso seja percorrido todo o segundo loop e não ocorra trocas
			* a iteração do primeiro loop é encerrada (sinalização de que
		  * não há trocas a serem realizadas no array - o mesmo está odernado).
			*/
			if (!flag) {
				break;      
			}
		}
	}
}