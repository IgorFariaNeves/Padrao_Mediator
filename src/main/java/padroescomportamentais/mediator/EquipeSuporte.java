package padroescomportamentais.mediator;

public class EquipeSuporte implements Setor {

    private static EquipeSuporte instancia = new EquipeSuporte();

    private EquipeSuporte() {}

    public static EquipeSuporte getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A equipe vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A equipe agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A equipe vai analisar a sugestão: " + mensagem;
    }
}
