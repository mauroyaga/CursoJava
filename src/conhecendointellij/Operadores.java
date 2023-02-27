/*
                                 Tipos de Operadores

Nome do Programa: Testando Operadores
Descrição do Programa: Teste de Operadores unário Aritiméticos para algumas operações e retornado seus resultados.
Nome do Autor: Mauro Cesar Yaga Junior
Data: 27/02/23

Operador Aritiméticos:
+ , - , /, *, %

*/

package conhecendointellij;

public class Operadores {
    public static void main(String[] args) {
        int num1= 10, num2 = 30;
        int soma = num1 + num2;

        System.out.println(num1 + num2);  //Aqui foi passado como parametro a soma das variaveis. Imprimira os resulatado.

        /*Nesta linha ao colocar o operador + ao lado de uma string dentro do metodo System
        o programa entndera como uma concatenação e não como soma todos os operadores + a frente da string.*/
        System.out.println(num1 + num2 + " O número é: " + num1 + num2); //A soma antes da string ocorre normalmente;
        System.out.println(soma);







    }
}
