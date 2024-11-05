package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarSuporte() {
        Cliente cliente = new Cliente();
        assertEquals("O Suporte Técnico agradece seu contato.\n" +
                        "A equipe respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A equipe agradece a mensagem: Ótimo atendimento",
                cliente.elogiarSuporte("Ótimo atendimento"));
    }

    @Test
    void deveReclamarSuporte() {
        Cliente cliente = new Cliente();
        assertEquals("O Suporte Técnico agradece seu contato.\n" +
                        "A equipe respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A equipe vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                cliente.reclamarSuporte("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirSuporte() {
        Cliente cliente = new Cliente();
        assertEquals("O Suporte Técnico agradece seu contato.\n" +
                        "A equipe respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A equipe vai analisar a sugestão: Ampliar horário funcionamento",
                cliente.sugerirSuporte("Ampliar horário funcionamento"));
    }

}
