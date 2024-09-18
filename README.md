# Desafio de Interface - Udemy

Este projeto foi criado como parte de um desafio para explorar e testar o uso de interfaces em Java. Ele simula um sistema de mapeamento de diferentes tipos de estruturas, como edifícios, linhas de utilidade e atrações turísticas, utilizando interfaces para mapear e categorizar essas entidades. Essas entidades são mapeadas e devolvidas como json, que poderiam ser utilizadas em uma aplicação de mapeamento

## Funcionalidades

O código realiza as seguintes operações:

- Cria uma lista de objetos que implementam a interface `Mappable`.
- Adiciona diferentes tipos de entidades (como edifícios, linhas de utilidade e atrações turísticas) à lista.
- Cada entidade é categorizada com base no seu uso, como governamental, entretenimento, esportivo, etc.
- Executa a função `mapIt()` para mapear cada objeto, mostrando seu tipo e uso.
- O exemplo do saída é um json que poderia ser utilizado em uma aplicação de mapeamento, por exemplo.

## Estrutura do Projeto

### Classes e Interfaces

- **`Mappable`**: Interface que define o comportamento de objetos que podem ser mapeados.
- **`Building`**: Classe que representa um edifício e implementa a interface `Mappable`.
- **`UtilityLine`**: Classe que representa uma linha de utilidade pública e implementa a interface `Mappable`.
- **`Tourism`**: Classe que representa uma atração turística e implementa a interface `Mappable`.

### Tipos de Dados

- **`UsageType`**: Enum que define os tipos de uso para os edifícios (como GOVERNMENT, ENTERTAINMENT, SPORTS, etc.).
- **`UtilityType`**: Enum que define os tipos de utilidades (como FIBER_OPTIC, WATER, ELETRICAL).
- **`TourismType`**: Enum que define os tipos de turismo (como VIEW, CULTURE).

## Como Executar

1. Certifique-se de ter o Java instalado em sua máquina (versão 8 ou superior).
2. Clone este repositório:
    ```bash
    git clone https://github.com/iagooteles/interfacesJAVA.git
    ```
3. Entre na pasta:
    ```bash
    cd interfacesJAVA/
    ```
4. Compile o projeto:
    ```bash
    javac Main.java
    ```
5. Execute o projeto:
    ```bash
    java Main
    ```

## Exemplo de Saída

Ao executar o programa, ele exibirá as informações de mapeamento dos diferentes objetos criados;

Ex: "properties": {"type": "POLYGON", "label": " (CULTURE)", "marker": "PURPLE PUSH_PIN" , "name": "Museu do som e imagem", "usage": "CULTURE" }
