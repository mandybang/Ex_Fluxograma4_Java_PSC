/**Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro), ou seja, A*B,
 * por intermédio de adições sucessivas. Tanto A quanto B devem ser fornecidos pela pessoa utilizadora do programa.
 */

import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Digite o valor de A (número real): ");
        double a = input.nextDouble();

        System.out.print("Digite o valor de B (número inteiro): ");
        int b = input.nextInt();

        // Verifica se B é negativo e ajusta o sinal de A em conformidade
        boolean isNegative = false;
        if (b < 0) {
            isNegative = true;
            b = -b;
        }

        double produto = 0;
        for (int i = 0; i < b; i++) {
            produto += a;
        }

     
        if (isNegative) {
            produto = -produto;
        }

        System.out.println("O produto de A por B é: " + produto);

        input.close();
    }
    
}
