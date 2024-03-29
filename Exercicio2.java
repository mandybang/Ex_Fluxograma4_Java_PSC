/**Faça um programa que leia um número indeterminado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. 
 * Finalize a entrada com valor negativo ou zero.
 switch case*/

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        double quad;
        double cubo;
        double raiz;
      
        System.out.println("Digite vários números: (Caso queira encerrar digite -1 ou zero) ");
        while (true) {
            num = input.nextInt();

                switch (num) {
                    case 0:
                    input.close();
                    System.out.println("Programa encerrado.");
                    return;

                    default:
                    if (num<=0) {
                        System.out.println("Programa encerrado.");
                    return;
                    }
                    else
                    {
                        System.out.println("O número lido é: " + num);
                    quad = Math.pow(num, 2);
                        System.out.println("O quadrado desse numero é: " + quad);
                    cubo = Math.pow(num, 3);
                        System.out.println("O cubo desse numero é: " + cubo);
                    raiz = Math.sqrt(num);
                        System.out.println("A raiz desse numero é: " + raiz);

                        
                    }
                    
                        
                }
                
            }
            
        }
    }