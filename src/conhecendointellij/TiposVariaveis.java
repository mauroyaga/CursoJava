/*
                                           Tipos de Variaveis
Nome do Programa: Teste
Descrição do Programa: É declarado diferentes tipos de variaveis com diferentes valores e chamado
sua saída em tela de forma concatenada para dar sentido aos valores.
Nome do Autor: Mauro Cesar Yaga Junior
Data: 27/02/23

*/

package conhecendointellij;

public class TiposVariaveis {
    public static void main(String[] args) {
        /* Tipos Primitivos*/
        int idade = 10;
        double salario = 10000;
        float salarioFloat = 10000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 10000L;
        char caractere = 'A';             //Ocupa 2 bytes para suportar padrões universais
        char numeroCaracter = '\u0042';


        /*Tipo reference String
        AS string são declaradas entre parenteses*/


        String nome = "Mauro Yaga";
        String endereco = "Rua Aparecida n° 122, Cep: 851545-4 Jd Programação";
        String telefone = "(55)86432845";           //Telefones normalmente são declarados com strings para utilizar suas mascaras ex: (55).

        // As saídas são concatenadas com o "+"
        System.out.println("O nome é: " + nome + " A idade é: " + idade);
        System.out.println("O cliente" + " " + nome + " domiciliado no endereço: " + endereco + " e telefone: " + telefone + " NAO possui débitos pendentes!");


    }
}
