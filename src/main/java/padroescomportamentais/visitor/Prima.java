package padroescomportamentais.visitor;

public class Prima implements Pessoa {

    private int cpf;
    private String nome;
    private String cargo;
    private float salario;

    public Prima(int cpf, String nome, String cargo,float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
    public float getSalario() {
        return salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPrima(this);
    }

}
