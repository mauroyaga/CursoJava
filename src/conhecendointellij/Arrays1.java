

/*
                                               Arrays

Nome do Programa: Testando Matrizes Unidimencionais
Descrição do Programa: Teste de Controle de fluxo apartir de um teste lógico condicional retornan-se valores especificos
Nome do Autor: Mauro Cesar Yaga Junior
Data: 27/02/23

Em Java há 2 tipos de variaveis:
Primitivo;
Reference (Objetos);


*/

package conhecendointellij;

public class Arrays1 {
    public static void main(String[] args) {

        //sintaxe para criação de um array tipo[] nomedoarray. Em java o array é um objeto

        char[] nome;      //Apartir desta declaração criou-se uma referência mais não ocupou o espaço na memória;

        //Para Criar uma alocação na memória declare-se

        /*Regras para declaração de arrays
        1° Ao declarar um array deve-se passar o seu tamanho como parametro;
        2° A palavra new é utilizada para criar objetos
        */
        int[] idade = new int[10];  //Esta sintaxe int[] idade = new tipo[tamanho do array] referencia o array e atribui a referencia
        //a um objeto

        idade[0] = 20;
        idade[1] = 10;
        idade[2] = 30;

        System.out.println("Idade na posição 0: " + idade[0]);
        System.out.println("Idade na posição 1: " + idade[1]);
        System.out.println("Idade na posição 2: " + idade[2]);


    }
}
