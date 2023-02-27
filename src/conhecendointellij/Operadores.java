/*
                                 Tipos de Operadores

Nome do Programa: Testando Operadores
Descrição do Programa: Teste de Operadores unário Aritiméticos para algumas operações e retornado seus resultados.
Nome do Autor: Mauro Cesar Yaga Junior
Data: 27/02/23

Operador Aritiméticos:
+ , - , /, *, %

Operadores de Comparação (retornam verdadeiro ou falso)
>, <, =, , <=, >=, ==, !=





*/
                  //Aritiméticos
package conhecendointellij;

public class Operadores {
    public static void main(String[] args) {

        //Aritiméticos

        float num1= 10, num2 = 30;


        float soma = num1 + num2;
        float sub = num1 - num2;
        float div = num1 / num2;
        float mult = num1 * num2;
        float rest = num1 % num2;


        System.out.println(num1 + num2);  //Aqui foi passado como parametro a soma das variaveis. Imprimira os resulatado.

        /*Nesta linha ao colocar o operador + ao lado de uma string dentro do metodo System
        o programa entndera como uma concatenação e não como soma todos os operadores + a frente da string.*/
        System.out.println(num1 + num2 + " O número é: " + num1 + num2); //A soma antes da string ocorre normalmente;
        System.out.println(soma);    //Imprime num1 + num2 atribuidao a varaivael soma
        System.out.println("num1 - num2 = " + sub);
        System.out.println("num1 / num2 = " + div);
        System.out.println("num1 x num2 = " + mult);
        System.out.println("O resto de num1 / num2 = " +rest);


        //Comparação
        //retornara o valor lógico verdadeiro ou falso dependendo do valor do resultado da comparação

        boolean maiorIgual = num1 == num2;

        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(maiorIgual);
    }
}


