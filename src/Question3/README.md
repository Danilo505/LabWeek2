# Questão 3 Instrumentos musicais

Nessa terceira questão do lab, tinhamos que criar uma class pai chamada instrumentos e subclasses de cada instrumento. Depois tinhamos que criar uma classe orquestra que iria receber uma lista de instrumentos.


## Código do Diagrama classe

Abaixo esta o código do diagrama de classe feito no Mermaid.
    classDiagram
            Instrumento <|-- Pratos
            Instrumento <|-- Violao
            Instrumento <|-- Trompete
            Instrumento <|-- Tambor
            Instrumento <|-- Flauta
            Instrumento <|-- Guitarra
            

            
        class Instrumento{
            void Instrumento()
            void toStriing()
            void play()
        }

        class Pratos{
            void Pratos()
            void play()
            void toStriing()
        }

        class Violao{
            void Violao()
            void play()
            void toStriing()
        }

        class Trompete{
            void Trompete()
            void play()
            void toStriing()
        }
        class Tambor{
            void Tambor()
            void play()
            void toStriing()
        }
        class Flauta{
            void Flauta()
            void play()
            void toStriing()
        }
        class Guitarra{
            void Guitarra()
            void play()
            void toStriing()
        }
        class Orquestra{
            Instrumento[] orquestraInstrumentos
            void Orquestra()
            void play()
            void play(int)
            void add(Instrumento)
        }

## Imagem do Diagrama de classe
![Diagrama](https://github.com/Danilo505/LabWeek2/blob/main/src/Question3/Imagens/DiagramaDeClasse.jpeg)

## Execução

![Execução](https://github.com/Danilo505/LabWeek2/blob/main/src/Question3/Imagens/Execucao3.jpeg)        