package padroescomportamentais.visitor;

public class Filho implements Pessoa {

    private int cpf;
    private String nome;
    private Profissao profissao;

    public Filho(int cpf, String nome, Profissao profissao) {
        this.cpf = cpf;
        this.nome = nome;
        this.profissao = profissao;
    }

    public int getMatricula() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return this.profissao.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirFilho(this);
    }

}
