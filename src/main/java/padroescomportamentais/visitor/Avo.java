package padroescomportamentais.visitor;

public class Avo implements Pessoa {

    private int cpf;
    private String nome;
    private String titulacao;

    public Avo(int cpf, String nome, String titulacao) {
        this.cpf = cpf;
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public int getMatricula() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirAvo(this);
    }

}
