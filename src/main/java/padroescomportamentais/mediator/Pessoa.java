package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiarSuporte(String mensagem) {
        return Suporte.getInstancia().receberElogio(mensagem);
    }

    public String reclamarSuporte(String mensagem) {
        return Suporte.getInstancia().receberReclamacao(mensagem);
    }

    public String sugerirSuporte(String mensagem) {
        return Suporte.getInstancia().receberSugestao(mensagem);
    }

}
