/**Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material radioativo. 
 * Sabendo-se que este perde 25% de sua massa a cada 30 segundos. 
 * Criar um programa que calcule iterativamente e imprima o tempo necessário para que a massa deste material
 * se torne menor que 0,10 grama. O programa pode calcular o tempo para várias massas.
 */

public class Exercicio11 {
    public static void main(String[] args) {
        double massaInicial = 1.0; 
        double taxaPerdaMassa = 0.25; 
        double massaLimite = 0.10; 
        int tempo = 0; 

        
        while (massaInicial >= massaLimite) {
            massaInicial *= (1 - taxaPerdaMassa); // Calcula a nova massa após a perda de massa
            tempo += 30; 
        }

        System.out.println("Tempo necessário para que a massa se torne menor que 0,10 gramas: " + tempo + " segundos.");
    }
    
}
