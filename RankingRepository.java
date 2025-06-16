import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class RankingRepository {
    private String caminhoArquivo;

    public RankingRepository(String caminhoArquivo) {
        this.caminhoArquivo = caminhoArquivo;
    }

    public void registrar(Jogador jogador, int pontuacao) {
        try (FileWriter writer = new FileWriter(caminhoArquivo, true)) {
            writer.write(jogador.getUsuario() + ";" + pontuacao + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao registrar ranking.");
        }
    }

    public void exibirRanking() {
        System.out.println("\n===== TOP 10 RANKING =====");
        try {
            List<String> linhas = new ArrayList<>(Files.readAllLines(new File(caminhoArquivo).toPath()));
            linhas.sort((a, b) -> Integer.parseInt(b.split(";")[1]) - Integer.parseInt(a.split(";")[1]));

            for (int i = 0; i < Math.min(10, linhas.size()); i++) {
                System.out.println((i + 1) + ". " + linhas.get(i));
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler ranking.");
        }
    }
}
