/**Dados dois países, A com população igual a cinco milhões de pessoas, 
 * e taxa de natalidade de três por cento ao ano, e, B, com população igual a sete milhões de pessoas
 * e taxa de natalidade de dois por cento ao ano, escreva um programa em Java que calcule iterativamente
 * e exiba em quantos anos a população de A ultrapassará a população de B.
 */

public class Exercicio9 {
    public static void main(String[] args) {
        int populacaoA = 5000000; 
        double taxaNatalidadeA = 0.03;
        int populacaoB = 7000000; 
        double taxaNatalidadeB = 0.02; 
        int anos = 0;

    
        while (populacaoA <= populacaoB) {
            populacaoA += populacaoA * taxaNatalidadeA; 
            populacaoB += populacaoB * taxaNatalidadeB; 
            anos++; 
        } 

    System.out.println("Após " + anos + " anos, a população de A ultrapassará a população de B.");

    }
}
