import java.util.*;

public class BancoDePerguntas {
    public static List<Pergunta> carregarPerguntas() {
        List<Pergunta> lista = new ArrayList<>();

        lista.add(new Pergunta("1. O que é uma classe em Java?",
                new String[]{"A) Um tipo de variável.", "B) Um arquivo de configuração.", "C) Um modelo para criar objetos.", "D) Um componente da interface gráfica."},
                'C', "Fácil", "Capítulo 1"));

        // Adicione as outras perguntas seguindo o mesmo padrão...

        return lista;
    }
}
