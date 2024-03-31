/**Crie um programa em Java que implementa um jogo simples de adivinhação. 
 * O objetivo do jogo é que o usuário tente adivinhar um número secreto gerado aleatoriamente pelo computador. 
 * Este número estará entre 1 e 100, inclusive. 
 * Para tornar o jogo interativo e dar feedback ao jogador, 
 * o programa deve informar após cada tentativa se o palpite do usuário é muito alto, muito baixo, ou correto.
 * O jogo termina quando o usuário acertar o número, 
 * e o programa deve informar o número de tentativas que foram necessárias para chegar à resposta correta. 
 * Exemplo:

Bem-vindo ao Jogo de Adivinhação!
Estou pensando em um número entre 1 e 100...
Tente adivinhar qual é!
Digite seu palpite: 50
Muito alto. Tente novamente.
Digite seu palpite: 25
Muito baixo. Tente novamente.
Digite seu palpite: 37
Parabéns! Você acertou o número em 3 tentativas!

 */

import java.util.Scanner;
import java.util.Random;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random gerar = new Random();

        System.out.println("Bem-vindo ao Jogo de Adivinhação!");
        System.out.println("Estou pensando em um número entre 1 e 100...");
        System.out.println("Tente adivinhar qual é!");

        int numeroSecreto = gerar.nextInt(100) + 1;
        int tentativas = 0;
        int palpite;

        do {
            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();
            tentativas++;

            if (palpite < numeroSecreto) {
                System.out.println("Muito baixo. Tente novamente.");
            } else if (palpite > numeroSecreto) {
                System.out.println("Muito alto. Tente novamente.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas!");
            }
        } while (palpite != numeroSecreto);

        input.close();
    }
}
