/**Em um campeonato de LOL, enquanto não há a tomada de território, 
 * o contador implementado deve contar (que é contabilizado pelo jogo), 
 * o número de kills, deaths e assists. Se o número de kills for menor ou igual a 5, 
 * ele mostra a mensagem “noob”, se chegar a 20 ou mais “master”. 
 * Se o número de deaths chegar a 20 ou mais,  ele mostra a mensagem “Houston, we have a problem”. 
 * Se o número de assists chegar a 20 ou mais, é mostrada a mensagem: “team work”. 
 * Lembre-se, é uma rotina que continua enquanto não houver um vencedor.
Dicas: 
- há kills, deaths e assists total e da rodada
- medite na frase: enquanto não há um vencedor, faça…
- pergunte a cada loop o número de cada medida comentada.
- você deve perguntar se há um vencedor a cada loop…
 */

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalKills = 0;
        int totalDeaths = 0;
        int totalAssists = 0;
        boolean vencedor = false;

        while (!vencedor) {
            System.out.println("Informe o número de kills, deaths e assists desta rodada:");
            int killsRodada = input.nextInt();
            int deathsRodada = input.nextInt();
            int assistsRodada = input.nextInt();

            totalKills += killsRodada;
            totalDeaths += deathsRodada;
            totalAssists += assistsRodada;

            System.out.println("Kills totais: " + totalKills);
            System.out.println("Deaths totais: " + totalDeaths);
            System.out.println("Assists totais: " + totalAssists);

            if (totalKills <= 5) {
                System.out.println("Noob");
            } else if (totalKills >= 20) {
                System.out.println("Master");
            }

            if (totalDeaths >= 20) {
                System.out.println("Houston, we have a problem");
            }

            if (totalAssists >= 20) {
                System.out.println("Team work");
            }

            System.out.println("Há um vencedor? (sim/não)");
            String resposta = input.next();
            if (resposta.equalsIgnoreCase("sim")) {
                vencedor = true;
            }
        }

        input.close();
    }
}