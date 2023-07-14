
# Questão 4 Relações de Associação, Agregação e Composição

Nessa quarta questão do lab, tinhamos que criar uma classe pai chamada mascote que teria que ser os métodos comuns para todos os animas. Criamos também três classes cada uma refereciando o tipo de animal (pássaro, mamífero e réptil). Depois criamos classes para cada animal e atribuimos a um tipo. Por fim criamos a classe jogador que ira adquirir um animal e adicionalo em sua lista de mascotes.


## Código do Diagrama classe

Abaixo esta o código do diagrama de classe feito no Mermaid.

    classDiagram
            Mascote <|-- Passaro
            Mascote <|-- Reptil
            Mascote <|-- Mamifero
        
            Passaro <|-- Falcao
            Passaro <|-- Pato
        
            Reptil <|-- Largato
            Reptil <|-- Cobra
        
            Mamifero <|-- Morcego
            Mamifero <|-- Gato
        
        class Mascote{
            void Mascote()
            void comer()
            void dormir()
            void treinar()
            String getName()
        }
        
        class Passaro{
            void Passaro()
            void voar()
            String getName()
        }
        class Reptil{
            void Reptil()
            void andar()
            String getName()
        }
        class Mamifero{
            void Mamifero()
            void andar()
            String getName()
        }
        class Falcao{
            String name
            void Falcao()
            String getNome()
        }
        class Pato{
            String name
            void Pato()
            String getNome()
            void andar()
            void nadar()
        }
        class Largato{
            String name
            void Largato()
            String getNome()
        }
        class Cobra{
            String name
            void Cobra()
            String getNome()
        }
        class Morcego{
            String name
            void Morcego()
            String getNome()
            void voar()
        }
        class Gato{
            String name
            void Gato()
            String getNome()
        }
        class Jogador{
            Mascote[] mascotes
            void Jogador()
            void showMascotes()
            void AdquirirMascote(Mascote)
        }
## Imagem do Diagrama de classe
![Diagrama](https://github.com/Danilo505/LabWeek2/blob/main/src/Question4/Imagens/DiagramaDeClasse.jpeg)

## Execução

![Execução](https://github.com/Danilo505/LabWeek2/blob/main/src/Question4/Imagens/Execucao.jpeg)