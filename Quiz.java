import java.util.*;

public class Quiz {
    private List<Pergunta> perguntas;
    private Jogador jogador;

    private int faceis = 0, medias = 0, dificieis = 0;

    public Quiz(Jogador jogador) {
        this.jogador = jogador;
        this.perguntas = BancoDePerguntas.carregarPerguntas();
    }

    public int iniciar() {
        Collections.shuffle(perguntas);
        Scanner scanner = new Scanner(System.in);
        int acertos = 0;
        int erros = 0;

        for (Pergunta p : perguntas) {
            System.out.println(p.getTexto() + " (Capítulo: " + p.getCapitulo() + ")");
            for (String o : p.getOpcoes()) {
                System.out.println(o);
            }

            System.out.print("Sua resposta: ");
            char resp = scanner.nextLine().toUpperCase().charAt(0);

            if (resp == p.getRespostaCorreta()) {
                System.out.println("✔️ Correto!\n");
                acertos++;
                contarNivel(p.getNivel());
            } else {
                System.out.println("❌ Errado! Resposta correta: " + p.getRespostaCorreta() + "\n");
                erros++;
                if (erros >= 4) {
                    break;
                }
            }
        }

        System.out.println("Fáceis acertadas: " + faceis);
        System.out.println("Médias acertadas: " + medias);
        System.out.println("Difíceis acertadas: " + dificieis);
        return acertos;
    }

    private void contarNivel(String nivel) {
        switch (nivel) {
            case "Fácil" -> faceis++;
            case "Média" -> medias++;
            case "Difícil" -> dificieis++;
        }
    }
}
