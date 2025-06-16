import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Jogador {
    private String nome;
    private String usuario;
    private String email;
    private String codigo;

    public Jogador(String nome, String usuario, String email, String codigo) {
        this.nome = nome;
        this.usuario = usuario;
        this.email = email;
        this.codigo = codigo;
    }

    public String getNome() { return nome; }
    public String getUsuario() { return usuario; }

    public void salvar() {
        // Cria pasta "data" se não existir
        File diretorio = new File("data");
        if (!diretorio.exists()) {
            diretorio.mkdir();
        }

        // Salva em "data/jogadores.txt"
        try (FileWriter writer = new FileWriter("data/jogadores.txt", true)) {
            writer.write(nome + ";" + usuario + ";" + email + ";" + codigo + "\n");
            writer.flush();
        } catch (IOException e) {
            System.out.println("Erro ao salvar jogador: " + e.getMessage());
        }
    }
}
