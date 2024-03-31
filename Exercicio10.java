/**Escreva um programa que: 
leia 100 fichas, onde cada ficha contém o número de matrícula e a nota de cada aluno de um determinado curso;
determine e imprima as duas maiores notas, juntamente com o número de matrícula do aluno que obteve cada uma delas; 
assuma que não exista dois ou mais alunos com a mesma nota;
*/

import java.util.Scanner;
public class Exercicio10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double maiorNota = Double.MIN_VALUE;
        double segundaMaiorNota = Double.MIN_VALUE;
        int matriculaMaiorNota = 0;
        int matriculaSegundaMaiorNota = 0;

        for (int i = 0; i < 100; i++) {
            System.out.println("Digite o número de matrícula do aluno:");
            int matricula = input.nextInt();
            System.out.println("Digite a nota do aluno:");
            double nota = input.nextDouble();

            if (nota > maiorNota) {
                segundaMaiorNota = maiorNota;
                matriculaSegundaMaiorNota = matriculaMaiorNota;

                maiorNota = nota;
                matriculaMaiorNota = matricula;
            } else if (nota > segundaMaiorNota) {
                segundaMaiorNota = nota;
                matriculaSegundaMaiorNota = matricula;
            }
        }

        System.out.println("A maior nota é: " + maiorNota + ", Matrícula: " + matriculaMaiorNota);
        System.out.println("A segunda maior nota é: " + segundaMaiorNota + ", Matrícula: " + matriculaSegundaMaiorNota);

        input.close();
    }
}
