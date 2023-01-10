package padroescomportamentais.visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirFilho(Filho filho) {
        return "Filho{" +
                "cpf=" + filho.getMatricula() +
                ", nome='" + filho.getNome() + '\'' +
                ", curso=" + filho.getProfissao() +
                '}';
    }

    @Override
    public String exibirAvo(Avo avo) {
        return "Avo{" +
                "cpf=" + avo.getMatricula() +
                ", nome='" + avo.getNome() + '\'' +
                ", titulacao='" + avo.getTitulacao() + '\'' +
                '}';
    }

    @Override
    public String exibirPrima(Prima prima) {
        return "Prima{" +
                "cpf=" + prima.getCpf() +
                ", nome='" + prima.getNome() + '\'' +
                ", profissao=" + prima.getCargo() +
                ", salario=" + prima.getSalario() +
                '}';
    }
}
