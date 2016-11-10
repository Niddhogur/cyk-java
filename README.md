# Cyk-Java
Esse projeto visa implementar o algoritmo Cyk para a linguagem Java. Os pacotes de código-fonte estão localizados na pasta `\source\`, divididos em dois pacotes:

## Pacote grammar
Contém as classes que dizem respeito à gramática. A principal classe deste é a classe `FncGrammar`, onde é representada e avaliada gramáticas que estejam na Forma Normal de Chomsky.

## Pacote handlers
Contém classes auxiliares para o processamento de arquivos. A classe `FileHandler` é responsável por varrer um arquivo de texto bem formado e retornar uma `FncGrammar`.

# Instruções de Uso
A utilização da aplicação é dada da seguinte forma:
```bash
java -jar Cyk.jar <arquivo_de_regras_gramatica> <palavra_entrada>
```
onde `<arquivo_de_regras_gramatica>` é o arquivo contendo as regras de produção da gramática e `<palavra_entrada>` é a palavra a ser processada.

A aplicação produz na tela "SIM" caso a palavra seja produzida pela gramática e não caso contrário.

Exemplo:
```bash
java -jar Cyk.jar input1.txt aabba
>>> SIM
```