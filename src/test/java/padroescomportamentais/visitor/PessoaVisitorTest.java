package padroescomportamentais.visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirFilho() {
        Filho filho = new Filho(123456789, "Bambam", new Profissao("Nutricao"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Filho{cpf=123456789, nome='Bambam', curso=Nutricao}", visitor.exibir(filho));
    }

    @Test
    void deveExibirAvo() {
        Avo avo = new Avo(109876543, "Frederico", "PHD");

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Avo{cpf=109876543, nome='Frederico', titulacao='PHD'}", visitor.exibir(avo));
    }

    @Test
    void deveExibirPrima() {
        Prima prima = new Prima(1111111111, "Pedrita", "CEO",5057.97f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Prima{cpf=1111111111, nome='Pedrita', profissao=CEO, salario=5057.97}", visitor.exibir(prima));
    }

}