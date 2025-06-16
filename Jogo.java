import java.util.Scanner;

public class Jogo {
    private Jogador jogador;
    private Quiz quiz;
    private RankingRepository rankingRepo = new RankingRepository("data/ranking.txt");

    public void iniciar() {
        mostrarHistorinha();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu nome de usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite seu e-mail: ");
        String email = scanner.nextLine();

        System.out.print("Digite seu código de acesso: ");
        String codigo = scanner.nextLine();

        jogador = new Jogador(nome, usuario, email, codigo);
        jogador.salvar();  // Salva no arquivo

        System.out.println("\n✅ Cadastro realizado com sucesso!");
        System.out.println("🎮 Vamos dar início ao jogo!\n");

        quiz = new Quiz(jogador);
        int pontuacao = quiz.iniciar();

        rankingRepo.registrar(jogador, pontuacao);
        rankingRepo.exibirRanking();
    }

    private void mostrarHistorinha() {
        System.out.println("==============================================");
        System.out.println("🧙‍♂️ Em um reino distante, onde o conhecimento é magia...");
        System.out.println("Você, jovem aprendiz, está prestes a enfrentar o Desafio do Código.");
        System.out.println("Somente os que dominam as artes da programação Java conseguirão vencer.");
        System.out.println("Prepare-se para testar seus conhecimentos e conquistar seu lugar entre os mestres!");
        System.out.println("==============================================\n");
    }
}
