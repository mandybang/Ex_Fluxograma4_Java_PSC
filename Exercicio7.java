/**Crie um programa em Java que exiba formas geométricas na tela. 
 * Um menu deve ser exibido com as seguintes opções: retângulo, diagonal superior esquerda,
 * diagonal superior direita, diagonal inferior esquerda, diagonal inferior direita. 
 * As imagens devem ser formadas por asteriscos (*) e, a pessoa utilizadora deve informar a quantidade de colunas.
 * Abaixo estão alguns exemplos das formas:

*  *  *  * 
*  *  *  *
*  *  *  *
*  *  *  *

*  *  *  * 
*  *  *  
*  *  
*  

*  *  *  * 
   *  *  *
      *   *
          *
*   
*  * 
*  *  *  
*  *  *  *

          * 
       *  *
    *  *  *
*  *  *  *
*/


import java.util.Scanner;


public class Exercicio7 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo ao Programa de Formas Geométricas!");

        while (true) {
            System.out.println("\nEscolha uma forma geométrica:");
            System.out.println("1. Retângulo");
            System.out.println("2. Diagonal Superior Esquerda");
            System.out.println("3. Diagonal Superior Direita");
            System.out.println("4. Diagonal Inferior Esquerda");
            System.out.println("5. Diagonal Inferior Direita");
            System.out.println("6. Sair");

            System.out.print("Digite sua escolha: ");
            int escolha = input.nextInt();

            if (escolha == 6) {
                System.out.println("Obrigado por utilizar o programa!");
                break;
            }

            System.out.print("Digite o número de colunas: ");
            int colunas = input.nextInt();

            switch (escolha) {
                case 1:
                    exibirRetangulo(colunas);
                    break;
                case 2:
                    exibirDiagonalSuperiorEsquerda(colunas);
                    break;
                case 3:
                    exibirDiagonalSuperiorDireita(colunas);
                    break;
                case 4:
                    exibirDiagonalInferiorEsquerda(colunas);
                    break;
                case 5:
                    exibirDiagonalInferiorDireita(colunas);
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        input.close();
    }

    public static void exibirRetangulo(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void exibirDiagonalSuperiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void exibirDiagonalSuperiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = colunas - i; j > 0; j--) {
                System.out.print("  ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void exibirDiagonalInferiorEsquerda(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < colunas - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void exibirDiagonalInferiorDireita(int colunas) {
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k < colunas - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}