
/*                                               Arrays

Nome do Programa: Testando Matrizes Unidimencionais
Descrição do Programa: Teste
Nome do Autor: Mauro Cesar Yaga Junior
Data: 27/02/23

Para os tipos primitivos o java atribui o valor 0 para a inicialização de um vetor;
byte, short, int, float, double, long = 0
char = \u0000   (unicode par avazio)
boolean = false
reference = Null
*/

package conhecendointellij;

public class Arrays2 {
    public static void main(String[] args) {


        int[] idade = new int [3];  //Ao declara o vetor o java atribui o valor 0 para o tipo primitivo

        System.out.println("Idade na posição 0: " + idade[0]);
        System.out.println("Idade na posição 1: " + idade[1]);
        System.out.println("Idade na posição 2: " + idade[2]);

        float[] ida = new float [3];
        System.out.println("Idade na posição 3: " + idade[0]);
        System.out.println("Idade na posição 4: " + idade[1]);
        System.out.println("Idade na posição 5: " + idade[2]);

        char [] idad = new char [3];
        System.out.println("Idade na posição 6: " + idade[0]);
        System.out.println("Idade na posição 7: " + idade[1]);
        System.out.println("Idade na posição 8: " + idade[2]);

        boolean [] id = new boolean [3];
        System.out.println("Idade na posição 9: " + idade[0]);
        System.out.println("Idade na posição 10: " + idade[1]);
        System.out.println("Idade na posição 11: " + idade[2]);

        //Para a de claração de um array de String a sintaxe:
        System.out.println("A partir daqui o objeto string é um array de String[3]");

        String[] string =  new String[4];
        string[0] = "Mauro";
        string[1] = "Cesar";
        string[2] = "Yaga";
        string[3] = "Junior";

        System.out.println("Idade na posição 12: " + string[0]);
        System.out.println("Idade na posição 13: " + string[1]);
        System.out.println("Idade na posição 14: " + string[2]);
        System.out.println("Idade na posição 14: " + string[3]);

        //Nesta saída concatenei todas as posições das string

        System.out.println(string[0] + " "+string[1] + " " + string[2] + " " + string[3]);






    }
}
