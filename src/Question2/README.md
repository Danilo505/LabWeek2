

# Questão 2 Classificação Polimórfica

Nessa segunda questão do lab, tinhamos que criar uma class abstrata chamada arranjo e subclasses que herdam de arranjo. Essas subclasses tinham que ter métodos para adicionar, remover e listar os elementos dentro de suas listas. Outro ponto importante e que tinhamos que ordenar de ordem decrescente os elementos de cada lista.


## Código do Diagrama classe

Abaixo esta o código do diagrama de classe feito no Mermaid.
    classDiagram
            Arranjo <|--ShortList
            Arranjo <|--ByteList
            Arranjo <|--LongList
            Arranjo <|--CharList
            Arranjo <|--FloatList
            Arranjo <|--DoubleList
            Arranjo <|--IntegerList


        class Arranjo{
            T[] arr
            void Arranjo(T[])
            void classificar()
            void list()
            void short()
            void add(Long)
            void add(Float)
            void add(Byte)
            void add(Integer)
            void add(Double)
            void add(Short)
            void add(Character)
            void remove(Double)
            void remove(Character)
            void remove(Float)
            void remove(Short)
            void remove(Long)
            void remove(Integer)
            void remove(Byte)
        }

        class ShortList{
            Short[] arr
            void ShortList()
            void list()
            void remove(Short)
            void removeElemento(int)
            void add(Short)
            void classificar()
            void sort()
            int encontraIndex(Short)
        }
        class ShortList{
            Short[] arr
            void ShortList()
            void list()
            void remove(Short)
            void removeElemento(int)
            void add(Short)
            void classificar()
            void sort()
            int encontraIndex(Short)
        }

        class ByteList{
            Byte[] arr
            void ByteList()
            void list()
            void remove(Byte)
            void removeElemento(int)
            void add(Byte)
            void classificar()
            void sort()
            int encontraIndex(Byte)
        }
        class LongList{
            Long[] arr
            void LongList()
            void list()
            void remove(Long)
            void removeElemento(int)
            void add(Long)
            void classificar()
            void sort()
            int encontraIndex(Long)
        }
        class CharList{
            Character[] arr
            void CharList()
            void list()
            void remove(Character)
            void removeElemento(int)
            void add(Character)
            void classificar()
            void sort()
            int encontraIndex(Character)
        }
        class FloatList{
            Float[] arr
            void FloatList()
            void list()
            void remove(Float)
            void removeElemento(int)
            void add(Float)
            void classificar()
            void sort()
            int encontraIndex(Float)
        }
        class DoubleList{
            Double[] arr
            void DoubleList()
            void list()
            void remove(Double)
            void removeElemento(int)
            void add(Double)
            void classificar()
            void sort()
            int encontraIndex(Double)
        }
        class IntegerList{
            Integer[] arr
            void IntegerList()
            void list()
            void remove(Integer)
            void removeElemento(int)
            void add(Integer)
            void classificar()
            void sort()
            int encontraIndex(Integer)
        }

## Imagem do Diagrama de classe
![Diagrama](https://github.com/Danilo505/LabWeek2/blob/main/src/Question2/Imagens/DiagramaDeClasse.jpeg)

## Execução
![Execução](https://github.com/Danilo505/LabWeek2/blob/main/src/Question2/Imagens/Execucao.jpeg)