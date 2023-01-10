package padroescomportamentais.visitor;

public interface Visitor {

    String exibirFilho(Filho filho);
    String exibirAvo(Avo avo);
    String exibirPrima(Prima prima);

}
