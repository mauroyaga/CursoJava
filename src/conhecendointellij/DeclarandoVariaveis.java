
/*
Nome do Programa: Declarar Variavel
Descrição do Programa: Uma Variavle é declarada e seu valor é impresso na tela
Nome do Autor: Mauro Cesar Yaga Junior
Data: 27/02/23

*/


package conhecendointellij;

public class DeclarandoVariaveis {
    public static void main(String[] args) {

        /*Para a declaração de varia variavel segue a sintaxe de declaração: tipo <nomeVarivael> = valor da variavel
        *A de claração da varivel segue a convenção primeiro nome minusculo, a partir do segundo camelcase*/
        int idadeDosPais = 30;

        /*
                                System.out.println() é um método estático da classe System

        System do pacote java.lang. Esta classe é responsável por
        fornecer recursos relacionados ao ambiente de tempo de execução do sistema, como entrada e saída de dados, propriedades do sistema, etc.

        out - é um objeto de saída que é membro da classe System. É uma instância da classe PrintStream que
        fornece uma série de métodos úteis para imprimir dados em um console.

        println() - é um método da classe PrintStream que é usado para imprimir uma string de caracteres
        seguida por um caractere de nova linha (\n) em um console. Ele imprime o texto na saída padrão do console.*/
        System.out.println(idadeDosPais);  //Foi passado como parametro a variavel declarada anteriormente que sera imprimida seu valor.

        //Para concatenar a saída de string com a saída do valor da variavel segue a sintaxe médoto: System.out.println("string" +nome da variavel);
        System.out.println("A idade é: " + idadeDosPais);
    }
}
