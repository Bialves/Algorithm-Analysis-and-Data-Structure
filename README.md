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
> O objetivo do algoritmo é sempre encontrar o maior elemento, no par usado para comparação, e o mover para direita no vetor. E após isso, fazer o mesmo com o segundo maior elemento, depois com o terceiro... continuamente, até ordenar todos elementos (ordem crescente).

Características:
  - Compara elementos adjacentes (dois a dois)
  - Ordenação crescente e decrescente
  - Algoritmo estável

  Exemplo:
  
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
> **Note**
> Funciona dividindo uma matriz em submatrizes menores, classificando cada submatriz e, em seguida, mesclando as submatrizes classificadas novamente para formar a matriz classificada final.

Características:
  - Desempenho garantido no pior caso (limite superior igual ao limite inferior)
  - Ordenação crescente e decrescente
  - Algoritmo estável
  - Algoritmo recursivo

  Exemplo:
  
  vetor[] = {12,31,25,8,32,17,40,42}
  
  - 1º iteração: primeiro divida o vetor dado em duas metades, conforme `mid = número de elementos / 2`, ou seja, mid = 8 / 2 = 4.
    
    [12,31,25,8]   [32,17,40,42]
    
  - 2º iteração: novamente divida esses dois vetores em metades. Como eles são de tamanho 4, então divida-os em novos vetores de tamanho 2.

    [12,31]   [25,8]   [32,17]   [40,42]

  - 3º iteração: agora, novamente divida esses vetores para obter o valor atômico que não pode ser mais dividido.

    [12]   [31]   [25]   [8]   [32]   [17]   [40]   [42]

  Agora, combine-os da mesma maneira que foram quebrados. Na combinação, primeiro compare o elemento de cada vetor e, em seguida, combine-os em outro vetor em ordem classificada.
  
  - 4º iteração:

    $\textcolor{red}{[12] [31]}$   [25]   [8]   [32]   [17]   [40]   [42]

  - 5º iteração:

    [12] [31]   $\textcolor{red}{[8]   [25]}$   [32]   [17]   [40]   [42]

  - 6º iteração:

    [12] [31]   [8]   [25]   $\textcolor{red}{[17]   [32]}$   [40]   [42]

  - 7º iteração:

    [12] [31]   [8]   [25]   [17]   [32]   $\textcolor{red}{[40]   [42]}$
    
  ___

<p align="center">
  <img src="https://github.com/Bialves/Algorithm-Analysis/assets/77895233/cc9d3755-829f-4b4f-adc9-e71232155e2b" width="380" height="210">
</p>
        
</details>

<details>
  <summary markdown="span">Quick Sort</summary><br>
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
