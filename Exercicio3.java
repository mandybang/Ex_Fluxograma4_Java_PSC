/** Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
a) a quantidade de pessoas com idade superior a 50 anos;
b) a média das alturas das pessoas com idade entre 10 e 20 anos;
c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.
*/

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int qtdP50 = 0;
            int qtdP1020 = 0;
            double somaAlt = 0;
            int qtdP40kg = 0;

       
        for(int x = 1; x <= 10; x++){
            System.out.println("Informe sua idade, altura e peso, por gentileza: ");
            int idade = input.nextInt();
            double altura = input.nextDouble();
            double peso = input.nextDouble();
            


            if (idade > 50) {
             qtdP50 ++;   
            }

            if (idade <=20 && idade >=10) {
               somaAlt += altura;
               qtdP1020++;                
            }

            if (peso < 40) {
                qtdP40kg++;
            }
        }
        
        double medAlt = qtdP1020 > 0 ? somaAlt / qtdP1020 : 0;
        double porcP40kg = (double) qtdP40kg / 10*100;

        System.out.println("A qtd de pessoas com idade superior a 50 anos é: " + qtdP50);
        System.out.println("Média de altura das pessoas de 10 à 20 anos é: " + medAlt);
        System.out.println("Porcentagem de pessoas com o peso inferior a 40kg é: " + porcP40kg + "%");

        input.close();
    }
    
}
