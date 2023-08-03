# Algorithm-Analysis-and-Data-Structure
<div>
  <img alt="Static Badge" src="https://img.shields.io/badge/LICEN%C3%87A-MIT-black">
  <img alt="Static Badge" src="https://img.shields.io/badge/STATUS-Em_Desenvolvimento-yellow">
</div>
Repositório para estudo de algoritmos e estruturas de dados.
<br>

## Notação
- Big O (O()) descreve o **limite superior** da complexidade.
- Omega (Ω()) descreve o **limite inferior** da complexidade.
- Theta (Θ()) descreve o **limite exato** da complexidade.
- Little O (o()) descreve o **limite superior excluindo o limite exato**.
<br>

## Algoritmos
### Pesquisa
<details>
  <summary markdown="span">Sequencial</summary><br>
  <p>
    <img alt="Static Badge" src="https://img.shields.io/badge/Nota%C3%A7%C3%A3o_O-n-8A2BE2">
    <img alt="Lento" src="https://img.shields.io/badge/Lento-darkred">
  </p>

> **Note**
> Pesquisa em vetores ou listas de modo sequencial, elemento por elemento, de modo que a função do tempo em relação ao número de elementos é linear, ou seja, cresce proporcionalmente.

Características
- Algoritmo simples
- Menos otimizado
- Não recomendado para manipulação de um grande volume de dados

**Exemplo:**

  arr[] = {0,4,6,7,8,32}<br>
  elemento da busca: 8<br>

  - 1º iteração:

    arr[] = {`0`,4,6,7,8,32}<br>
    `0 == 8`? Não, passa para o próximo elemento.
    
  - 2º iteração:

    arr[] = {0,`4`,6,7,8,32}<br>
    `4 == 8`? Não, passa para o próximo elemento.
    
  - 3º iteração:

    arr[] = {0,4,`6`,7,8,32}<br>
    `6 == 8`? Não, passa para o próximo elemento.
    
  - 4º iteração:

    arr[] = {0,4,6,`7`,8,32}<br>
    `7 == 8`? Não, passa para o próximo elemento.
    
  - 5º iteração:

    arr[] = {0,4,6,7,`8`,32}<br>
    `8 == 8`? Sim, interrompe a iteração e retorna o elemento.
</details>
  
<details>
  <summary markdown="span">Binária</summary><br>
  <p>
    <img alt="Notação O" src="https://img.shields.io/badge/Nota%C3%A7%C3%A3o_O-log_n-8A2BE2" >
    <img alt="Static Badge" src="https://img.shields.io/badge/R%C3%A1pido-darkgreen">
  </p>

> **Note**
> Algoritmo de busca em vetores que segue o paradigma de Divisão e Conquista. Ela parte do pressuposto de que o vetor está ordenado e realiza sucessivas divisões do espaço de busca comparando o elemento buscado (chave) com o elemento no meio do vetor. Se o elemento do meio do vetor for a chave, a busca termina com sucesso. 
>> <p>low = 0<br>
>> high = número de elementos<br>
>> mid = (low + high) / 2
>>
>> Os referênciais operam com íncices, logo, se há o array = {1,2,3,4,5} e low = 0, low é igual ao índice 0 que contém o elemento de valor 1.</p>

Características
- Algoritmo mais sofisticado
- Melhor caso O(1)
- Mais eficiente
- Requer estruturas ordenadas

**Exemplo:**

  arr[] = {0,4,6,7,8,32}<br>
  elemento da busca: 8<br>
  mid = (0 + 5) / 2 = 2

  - 1º iteração:

    low -> elemento 0<br>
    high -> elemento 32<br>
    mid = -> elemento 6

    `8 < mid`? Se sim, high atualiza para (mid - 1).<br>
    `8 > mid`? Se sim, low atualiza para (mid + 1).


    Em nosso exemplo, 8 é maior que a referência mid, então a referência low é atualizada. Consequentemente, como delimitamos a área de busca com essa ação, a referência de mid também é atualizada.

> Atualizações:<br>
> estrutura arr[] = {7,8,32}<br>
> low = elemento 7<br>
> high = elemento 32<br>
> mid = (0 + 2) / 2 = 1 -> elemento 8</p>
    
  - 2º iteração:

    low -> elemento 7<br>
    high -> elemento 32<br>
    mid -> elemento 8

    `8 < mid`? Se sim, high atualiza para (mid - 1).<br>
    `8 > mid`? Se sim, low atualiza para (mid + 1).

    Como não é nenhum dos casos, é identificado que `mid == elemento da busca`, então mid é retornado e a pesquisa encerrada!
</details>
<br>

### Classificação
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
  - Não recomendado para manipulação de um grande volume de dados
  - Algoritmo estável
  - Não requer nenhum espaço de memória adicional

**Exemplo:**
  
  arr[] = {2,1,3,5,4}
  
  - 1º iteração:
    `2 > 1`? Sim, os mesmos são invertidos, arr[] = {1,2,3,5,4}

  - 2º iteração:
    `2 > 3`? Não, estado do array é mantido e o próximo elemento se torna o comparador

  - 3º iteração:
    `3 > 5`? Não, estado do array é mantido e o próximo elemento se torna o comparador

  - 4º iteração:
    `5 > 4`? Sim, os mesmos são invertidos, arr[] = {1,2,3,4,5}
  <br>

  Como não há mais elementos para realizar comparação, é compreendido que o array se encontra completamente ordenado.

  ___

<p align="center">
  <img src="https://github.com/Bialves/Algorithm-Analysis/assets/77895233/b524809e-d237-463c-9932-953b770b0553" width="380" height="240">
</p>
        
</details>

<details>
  <summary markdown="span">Merge Sort</summary><br>
  <p>
    <img alt="Notação O" src="https://img.shields.io/badge/Nota%C3%A7%C3%A3o_O-n_log_n-8A2BE2" >
    <img alt="Implementação" src="https://img.shields.io/badge/Implementa%C3%A7%C3%A3o-Dif%C3%ADcil-darkred" >
    <img alt="Static Badge" src="https://img.shields.io/badge/R%C3%A1pido-darkgreen">
  </p>
  
> **Note**
> Funciona dividindo uma matriz em submatrizes menores, classificando cada submatriz e, em seguida, mesclando as submatrizes classificadas novamente para formar a matriz classificada final.

Características:
  - Desempenho garantido no pior caso (limite superior igual ao limite inferior)
  - Algoritmo estável
  - Algoritmo recursivo
  - Gasto extra de memória

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
    <img alt="Notação O" src="https://img.shields.io/badge/Nota%C3%A7%C3%A3o_O-n_log_n-8A2BE2" >
    <img alt="Implementação" src="https://img.shields.io/badge/Implementa%C3%A7%C3%A3o-Dif%C3%ADcil-darkred" >
    <img alt="Static Badge" src="https://img.shields.io/badge/R%C3%A1pido-darkgreen">
  </p>

> **Note**
> Classificação baseada no algoritmo **Dividir e Conquistar** que escolhe um elemento como um pivô e particiona a matriz dada em torno do pivô escolhido, colocando o pivô em sua posição correta na matriz classificada.

Características:
  - Algoritmo instável (pior caso O(n²))
  - Algoritmo recursivo
  - Trabalha com referência (pivô)

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

    `[10,80,30,40,50,70]`
    
    <p align="center">
      pivô<br>
      [40]
    </p>

  <div>
    <p align="letf">
      esquerda -> [10,30]
    </p>
    <p align="right">
      [80,50,70] <- direita
    </p>
  </div>

  - 3º iteração:
    
    `[10,30]`<br>
    Como a matriz possui apenas 2 elementos, qualquer um dos dois pode ser pivô.

    <p align="center">
      pivô<br>
      [10]
    </p>

    <p align="right">
      [30] <- direita
    </p>
    
  - 4º iteração:
    
    `[80,50,70]`

    <p align="center">
      pivô<br>
      [50]
    </p>

    <p align="right">
      [80,70] <- direita
    </p>

  - 5º iteração:
    
    `[80,70]`

    <p align="center">
      pivô<br>
      [70]
    </p>

    <p align="right">
      [80] <- direita
    </p>
<br>
<br>

Agora que não é mais possível realizar partições, se for agrupado novamente os elementos conforme a ordem que os organizamos após as iterações, obteremos: `[10,30,40,50,70,80,90]`

 ___

<p align="center">
  <img src="https://github.com/Bialves/Algorithm-Analysis/assets/77895233/a25b71f0-f93a-4045-b9bd-7b60dc5c77b9" width="380" height="210">
</p>
  
</details>

<details>
  <summary markdown="span">Insertion Sort</summary><br>
  <p>
    <img alt="Notação O" src="https://img.shields.io/badge/Nota%C3%A7%C3%A3o_O%20-%20n%C2%B2-8A2BE2">
    <img alt="Static Badge" src="https://img.shields.io/badge/Implementa%C3%A7%C3%A3o-M%C3%A9dio-yellow">
    <img alt="Lento" src="https://img.shields.io/badge/Lento-darkred">
  </p>

> **Note**
> Funciona de forma semelhante à maneira como você classifica as cartas de baralho em suas mãos. O array é virtualmente dividido em uma parte classificada e uma não classificada. Os valores da peça não classificada são selecionados e colocados na posição correta na parte classificada.

Características:
  - In-place: Apenas requer uma quantidade constante de O(1) espaço de memória adicional
  - Algoritmo estável
  - Muitas trocas, e menos comparações

**Exemplo:**

  arr[] = {12, 11, 13, 5, 6}

  - 1º iteração: inicialmente, os dois primeiros elementos da matriz são comparados na classificação de inserção.

    {`12,11`,13,5,6}

    `12 < 11 || 11 < 12`? Os mesmos são invertidos, arr[] = {11,12,13,5,6}

  - 2º iteração: agora, passe para os próximos dois elementos e compare-os

    {11,`12,13`,5,6}

    `12 < 13 || 13 < 12`? Estado do array é mantido e o próximo elemento se torna o comparador

  - 3º iteração:

    {11,12,`13,5`,6}

    `13 < 5 || 5 < 13`? Os mesmos são invertidos, arr[] = {11,12,5,13,6}
  
    Após a troca, os elementos 12 e 5 não são classificados, portanto, trocam novamente.
    
    {11,`12,5`,13,6}
    
    arr[] = {11,5,12,13,6}
    
    Aqui, novamente 11 e 5 não são classificados, portanto, troque novamente.
    
    {`11,5`,12,13,6}

    arr[] = {5,11,12,13,6}

    Aqui, novamente 11 e 5 não são classificados, portanto, troque novamente.
    
    {`11,5`,12,13,6}

    arr[] = {5,11,12,13,6}

  - 4º iteração:
     
    {11,5,12,`13,6`}

    `13 < 6 || 6 < 13`? Os mesmos são invertidos, arr[] = {5,11,12,6,13}

    Agora, 6 é menor que 12, portanto, troque novamente.

    {5,11,`12,6`,13}

    arr[] = {5,11,6,12,13}

    Aqui, também a troca faz 11 e 6 não classificados, portanto, troque novamente.

    {5,`11,6`,12,13}

    arr[] = {5,6,11,12,13}

    Finalmente a estrutura está ordenada.

  ___

  <p align="center">
    <img src="https://github.com/Bialves/Algorithm-Analysis/assets/77895233/1e6cf6a8-9ef3-43a8-bf25-32a92a69bb7f" width="380" height="210">
  </p>

</details>
<br>

## Estrutura de Dados
<details>
  <summary markdown="span">Estáticas</summary>
  <details>
    <summary markdown="span">Array</summary><br>
    
  > **Note**
  > São objetos de recipientes que contém um número fixo de valores de um único tipo. O comprimento de um array é estabelecido quando criado, sendo que após a criação o seu comprimento fica fixo.

  #### Notação O
  - Inserção:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(1)-8A2BE2"> OU 
      <img alt="Static Badge" src="https://img.shields.io/badge/O(n)-8A2BE2">
    </p>
    
      > Inserções no fim da matriz possuem O(1), no início e no meio são O(n)

   - Remoção:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(1)-8A2BE2"> OU 
      <img alt="Static Badge" src="https://img.shields.io/badge/O(n)-8A2BE2">
    </p>
    
      > Remoções no fim da matriz possuem O(1), no início e no meio são O(n)

   - Pesquisa:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(n)-8A2BE2">
    </p>
  
      > Pesquisa é considerado O(n), porque no pior caso (matriz ordenada) é necessário percorrer n elementos de um matriz até encontrar o desejado.

   - Acesso:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(1)-8A2BE2">
    </p>
    
      > Acessos são O(1), pois matrizes alocam espaços físicos na memória e guardam referências para os mesmos, então o seu acesso é rápido em comparação com demais estruturas.
  </details>

  <details>
   <summary markdown="span">Pilha</summary><br>

  > **Note**
  > Estrutura de dados básica que fornece a lógica conhecida por LIFO - Last In, First out. Isso significa que o último dado adicionado a estrutura será o primeiro removido dela e por isso foca a entrada e saída de dados na mesma ponta do vetor/lista.

  #### Notação O
  - Inserção:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(1)-8A2BE2">
    </p>
    
      > Inserções possuem O(1), afinal, ocorrem apenas no topo

   - Remoção:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(1)-8A2BE2">
    </p>
    
      > Remoções possuem O(1), afinal, ocorrem apenas no topo

   - Acesso:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(n)-8A2BE2">
    </p>
  </details>
  
</details>

<details>
  <summary markdown="span">Dinâmicas</summary>
  <details>
    <summary markdown="span">ArrayList</summary><br>

  > **Note**
  > Classe Java implementada usando a interface List. Java ArrayList, como o nome sugere, fornece a funcionalidade de uma matriz dinâmica onde o tamanho não é fixo como uma matriz comum (array). Também como parte da estrutura de coleção, ele tem muitos recursos não disponíveis com arrays - métodos específicos.

  </details>
  
  <details>
    <summary markdown="span">LinkedList</summary><br>

  > **Note**
  > Consiste em nodos onde cada nodo contém dados e uma referência ao próximo nodo da lista. Ao contrário de uma matriz, os dados não são armazenados em um bloco contíguo de memória e não têm um tamanho fixo. Em vez disso, ele consiste em vários blocos de memória em endereços diferentes.

  #### Notação O
  - Inserção:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(1)-8A2BE2"> OU 
      <img alt="Static Badge" src="https://img.shields.io/badge/O(n)-8A2BE2">
    </p>
    
      > Inserções no início da lista possuem O(1), no fim e no meio são O(n)

   - Remoção:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(1)-8A2BE2"> OU 
      <img alt="Static Badge" src="https://img.shields.io/badge/O(n)-8A2BE2">
    </p>
    
      > Remoções no início da lista possuem O(1), no fim e no meio são O(n)

   - Pesquisa:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(n)-8A2BE2">
    </p>
  
      > Pesquisa é considerado O(n), porque no pior caso é necessário percorrer n elementos de um lista até encontrar o desejado

   - Acesso:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(n)-8A2BE2">
    </p>
    
      > Acessos são O(n), pois ao contrário de matrizes, é necessário percorrer toda a lista para chegar ao elemento desejado
  </details>

  <details>
   <summary markdown="span">Fila</summary><br>

  > **Note**
  > Estrutura de dados com um controle definido pela lógica FIFO - First In, Last Out. Esse controle quer dizer que os dados contidos nela só podem entrar apenas por uma ponta e deverão sair pela outra. Com isso, garante-se que o primeiro dado que entrou será o primeiro a sair da fila.

  #### Notação O
  - Inserção:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(1)-8A2BE2">
    </p>
    
      > Inserções possuem O(1), pois são realizadas na extremidade de uma lista

   - Remoção:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(1)-8A2BE2">
    </p>
    
      > Remoções possuem O(1), pois são realizadas na extremidade de uma lista

   - Pesquisa:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(n)-8A2BE2">
    </p>
  
      > Pesquisa é considerado O(n), porque no pior caso é necessário percorrer n elementos de um lista até encontrar o desejado

   - Acesso:
    <p>
      <img alt="Static Badge" src="https://img.shields.io/badge/O(n)-8A2BE2">
    </p>
  </details>

  <details>
   <summary markdown="span">Tree</summary><br>
  </details>
</details>
<br>

> Autora: [Bianca Alves](https://github.com/Bialves) 
