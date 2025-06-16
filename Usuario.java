import java.util.Scanner;

public class Usuario {
    private String nome;
    private int idade;

    public void coletarDados() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine(); // limpa buffer
        System.out.println("\nBoa sorte, " + nome + "!\n");
    }

    public String getNome() {
        return nome;
    }
}
