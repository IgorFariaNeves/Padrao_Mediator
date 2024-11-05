package padroescomportamentais.mediator;

public class Suporte {

    private static Suporte instancia = new Suporte();

    private Suporte() {}

    public static Suporte getInstancia() {
        return instancia;
    }

    public String receberElogio(String mensagem) {
        return "O Suporte Técnico agradece seu contato.\n" +
                "A equipe respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeSuporte.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacao(String mensagem) {
        return "O Suporte Técnico agradece seu contato.\n" +
                "A equipe respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeSuporte.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestao(String mensagem) {
        return "O Suporte Técnico agradece seu contato.\n" +
                "A equipe respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + EquipeSuporte.getInstancia().receberSugestao(mensagem);
    }

}
