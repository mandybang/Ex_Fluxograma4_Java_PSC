/**Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números ímpares e a soma dos números pares.
 3variaveis
 produto = resultado da multiplicação */ 

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        int impar = 1;
        int par = 0;
      
        System.out.println("Digite vários números positivos: (Caso queira encerrar digite -1) ");
        while (true) {
            num = input.nextInt();
            if (num <0) {
                break; // para sair do loop do while
                
            }

           else if (num % 2 == 0) {
                par = par + num;
            }

            else {
                impar = impar*num;
            }

        }
        System.out.println("Produto dos números ímpares: " + impar);
        System.out.println("Soma dos números pares: " + par);
        input.close();
    }

}