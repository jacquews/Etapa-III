public class Pergunta {
    private String texto;
    private String[] opcoes;
    private char respostaCorreta;
    private String nivel;
    private String capitulo;

    public Pergunta(String texto, String[] opcoes, char respostaCorreta, String nivel, String capitulo) {
        this.texto = texto;
        this.opcoes = opcoes;
        this.respostaCorreta = respostaCorreta;
        this.nivel = nivel;
        this.capitulo = capitulo;
    }

    public String getTexto() { return texto; }
    public String[] getOpcoes() { return opcoes; }
    public char getRespostaCorreta() { return respostaCorreta; }
    public String getNivel() { return nivel; }
    public String getCapitulo() { return capitulo; }
}
