# Algorithm-Analysis
<div>
  <img alt="Static Badge" src="https://img.shields.io/badge/LICEN%C3%87A-MIT-black">
  <img alt="Static Badge" src="https://img.shields.io/badge/STATUS-Em_Desenvolvimento-yellow">
</div>
Repositório para estudo de algoritmos e estruturas de dados.
<br>

## Algoritmos de Classificação
<details>
  <summary markdown="span">Bubble Sort</summary><br>
  <p>
    <img alt="Notação O" src="https://img.shields.io/badge/Nota%C3%A7%C3%A3o_O%20-%20n%C2%B2-8A2BE2">
    <img alt="Implementação" src="https://img.shields.io/badge/Implementa%C3%A7%C3%A3o-F%C3%A1cil-darkgreen">
    <img alt="Lento" src="https://img.shields.io/badge/Lento-darkred">
  </p>

> **Note**
> O algoritmo funciona sempre buscando o maior elemento, em um par usado para comparação, para o mover para direita. E após isso, fazer o mesmo com o segundo maior elemento, depois com o terceiro... continuamente, até ordenar todos elementos (ordem crescente).

Características:
  - Compara elementos adjacentes (dois a dois)
  - Ordenação crescente e decrescente
  - Algoritmo estável

**Exemplo:**
  
  vetor[] = {2,1,3,5,4}
  
  - 1º iteração:
    `2 > 1 ?` Sim, os mesmos são invertidos, vetor[] = {1,2,3,5,4}

  - 2º iteração:
    `2 > 3 ?` Não, estado do vetor é mantido e o próximo elemento se torna o comparador

  - 3º iteração:
    `3 > 5 ?` Não, estado do vetor é mantido e o próximo elemento se torna o comparador

  - 4º iteração:
    `5 > 4 ?` Sim, os mesmos são invertidos, vetor[] = {1,2,3,4,5}
  <br>

  Como não há mais elementos para realizar comparação, é compreendido que o vetor se encontra completamente ordenado.

  ___

<p align="center">
  <img src="https://github.com/Bialves/Algorithm-Analysis/assets/77895233/b524809e-d237-463c-9932-953b770b0553" width="380" height="240">
</p>
        
</details>

<details>
  <summary markdown="span">Merge Sort</summary><br>
  <p>
    <img alt="Notação O" src="https://img.shields.io/badge/Nota%C3%A7%C3%A3o_O-n(log_n)-8A2BE2" >
    <img alt="Implementação" src="https://img.shields.io/badge/Implementa%C3%A7%C3%A3o-Dif%C3%ADcil-darkred" >
    <img alt="Static Badge" src="https://img.shields.io/badge/R%C3%A1pido-darkgreen">
  </p>
  
> **Note**
> Funciona dividindo uma matriz em submatrizes menores, classificando cada submatriz e, em seguida, mesclando as submatrizes classificadas novamente para formar a matriz classificada final.

Características:
  - Desempenho garantido no pior caso (limite superior igual ao limite inferior)
  - Ordenação crescente e decrescente
  - Algoritmo estável
  - Algoritmo recursivo

**Exemplo:**
  
  [12,31,25,8,32,17,40,42]
  
#### Etapa de Divisão
  - 1º iteração: primeiro divida a matriz dada em duas metades, conforme **mid = número de elementos / 2**, ou seja, mid = 8 / 2 = 4.
    
    `[12,31,25,8]`   `[32,17,40,42]`
    
  - 2º iteração: novamente divida essas duas matrizes em metades. Como eles são de tamanho 4, então divida-os em novas matrizes de tamanho 2.

    `[12,31]`   `[25,8]`   `[32,17]`   `[40,42]`

  - 3º iteração: agora, novamente divida essas matrizes para obter o valor atômico que não pode ser mais dividido.

    `[12]`   `[31]`   `[25]`   `[8]`   `[32]`   `[17]`   `[40]`   `[42]`
    <br><br>

#### Etapa de Merge
Agora, combine-os da mesma maneira que foram quebrados. Na combinação, primeiro compare o elemento de cada matriz e, em seguida, combine-os em outra matriz em ordem classificada.
  
  - 4º iteração:

    `[12,31]`   [25]   [8]   [32]   [17]   [40]   [42]

  - 5º iteração:

    [12,31]   `[8,25]`   [32]   [17]   [40]   [42]

  - 6º iteração:

    [12,31]   [8,25]   `[17,32]`   [40]   [42]

  - 7º iteração:

    [12,31]   [8,25]   [17,32]   `[40,42]`

    Agora compare as matrizes com dois valores de dados e mescle-os em uma matriz de valores encontrados em ordem classificada.

  - 8º iteração:

    `[8,12,25,31]`   `[17,32,40,42]`

  - 9º iteração: por fim, há uma fusão final das matrizes.
    
    `[8,12,17,25,31,32,40,42]`
    
  ___

<p align="center">
  <img src="https://github.com/Bialves/Algorithm-Analysis/assets/77895233/cc9d3755-829f-4b4f-adc9-e71232155e2b" width="380" height="210">
</p>
        
</details>

<details>
  <summary markdown="span">Quick Sort</summary><br>
  <p>
    <img alt="Notação O" src="https://img.shields.io/badge/Nota%C3%A7%C3%A3o_O-n(log_n)-8A2BE2" >
    <img alt="Implementação" src="https://img.shields.io/badge/Implementa%C3%A7%C3%A3o-Dif%C3%ADcil-darkred" >
    <img alt="Static Badge" src="https://img.shields.io/badge/R%C3%A1pido-darkgreen">
  </p>

> **Note**
> Classificação baseada no algoritmo **Dividir e Conquistar** que escolhe um elemento como um pivô e particiona a matriz dada em torno do pivô escolhido, colocando o pivô em sua posição correta na matriz classificada.

Características:
  - Ordenação crescente e decrescente
  - Algoritmo instável (pior caso O(n²))
  - Algoritmo recursivo

A primeira etapa do Quick Sort é a partição. A partição é feita recursivamente em cada lado do pivô depois que o pivô é colocado em sua posição correta e isso finalmente classifica a matriz.

O pivô pode ser escolhido de diversos modos, mas aqui usaremos a lógica de definir o pivô sempre como o elemento do meio de uma matriz (pivô = número de elementos \ 2).
  
**Exemplo:**
  
  [10,80,30,90,40,50,70]

  pivô = 7 \ 2 = 3... lembrando que há posição 0, o elemento de valor 90 é o 3º elemento da matriz.

  - 1º iteração: alocamos todos os elementos de valor menor que o do nosso pivô a esquerda e os maiores a direita.

    <p align="center">
      pivô<br>
      [90]
    </p>

    <p align="letf">
     esquerda -> [10,80,30,40,50,70]
    </p>

Agora, basta realizar o mesmo passo a passo com as submatrizes formadas, até não ser mais possível particionar.

  - 2º iteração:
    
    <p align="center">
      pivô submatriz esq.<br>
      [40]
    </p>

  <div>
    <p align="letf">
      esquerda -> [10,30]
    </p>
    <p align="right">
      [50,70] <- direita
    </p>
  </div>
    
  - 3º iteração: 

 ___

<p align="center">
  <img src="https://github.com/Bialves/Algorithm-Analysis/assets/77895233/a25b71f0-f93a-4045-b9bd-7b60dc5c77b9" width="380" height="210">
</p>
  
</details>

<details>
  <summary markdown="span">Insertion Sort</summary><br>
</details>
<br>

## Estrutura de Dados
<details>
  <summary markdown="span">Estáticas</summary>
  <details>
    <summary markdown="span">Array</summary><br>
  </details>
</details>

<details>
  <summary markdown="span">Dinâmicas</summary>
  <details>
    <summary markdown="span">ArrayList</summary><br>
  </details>
  
  <details>
    <summary markdown="span">LinkedList</summary><br>
  </details>

 <details>
   <summary markdown="span">Tree</summary><br>
  </details>
</details>
<br>

> Autora: [Bianca Alves](https://github.com/Bialves) 
