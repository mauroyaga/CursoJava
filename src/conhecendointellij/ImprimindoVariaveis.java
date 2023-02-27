/*
Nome do Programa:
Descrição do Programa:
Nome do Autor:
Data:
*/


package conhecendointellij;

public class ImprimindoVariaveis {
    /*
                    A classe main foi declarada

    * main: È o metodo principal, o ponto de partida que a JVM vai buscar
    para iniciar a execução do programa;

    *public:  é um modificador de acesso que torna o mainmétodo  público e,
    portanto, acessível a partir de qualquer classe em qualquer pacote;

    * static: é um modificador de método que torna o método main um método estático,
    o que significa que ele pode ser chamado sem precisar criar uma instância da classe que o contém;

                    Com os parametros
    *  String[]: indica que o método main recebe um argumento de tipo array de String,
    que é comumente usado para passar informações de linha de comando para o programa Java;

    * args:O nome do array de argumentos é "args", que pode ser usado dentro do
    método para acessar esses argumentos;

   */
    public static void  main(String[] args){
        System.out.println("Testando o ctrl+shift+F0 no Intellij para imprimir o método main desta classe e não das outra no mesmo package.");
    }
}
