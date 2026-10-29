# BinarySearchTree
Código para o professor


Árvore de Busca Binária em Java

Nome do aluno: André Luiz Fontana Duarte

Descrição do projeto

Este projeto é uma atividade de programação em Java. O objetivo é criar uma Árvore de Busca Binária, permitindo inserir valores e contar a quantidade de nós folhas presentes na árvore.

Como o projeto funciona

O projeto foi dividido em três arquivos Java, cada um com sua função:

Node.java: representa cada nó da árvore, armazenando seu valor e as referências para os nós filhos da esquerda e da direita.

Tree.java: é responsável por organizar a árvore, inserir novos valores e contar a quantidade de nós folhas.

Main.java: é responsável por criar a árvore, inserir alguns números e mostrar o resultado da contagem de folhas.

A árvore funciona de acordo com as regras de uma Árvore de Busca Binária. Os valores menores ficam à esquerda e os valores maiores ficam à direita. Neste projeto, os valores repetidos são ignorados.

Um nó folha é aquele que não possui nenhum filho.

Exemplo de utilização da arvore

No arquivo Main.java, foram inseridos os seguintes valores na árvore:
    
   tree.addNode(10);
   tree.addNode(5);
   tree.addNode(15);
   tree.addNode(3);
   tree.addNode(7);
   tree.addNode(12);
   tree.addNode(20);
   tree.addNode(9);
   tree.addNode(22);
   tree.addNode(13);
   tree.addNode(40);
   tree.addNode(29);
   tree.addNode(19);
   
Depois de inserir os valores, o programa organiza a árvore seguindo as regras de uma Árvore de Busca Binária, colocando os números menores à esquerda e os maiores à direita.
Os nós folhas são os valores 3, 9, 13, 19, 22 e 29, pois não possuem filhos.
Ao executar o programa, a contagem de folhas será 5.
