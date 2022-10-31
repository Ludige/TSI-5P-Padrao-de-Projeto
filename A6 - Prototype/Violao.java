package Prototype;

public class Violao extends PrototipoViolao {

    public Violao(String nome, String tipoCorda,Integer qtd){
        this.nome = nome;
        this.tipoCorda = tipoCorda;
        this.qtdCordas = qtd;
    }

    protected Violao(Violao violao){
        this.nome = violao.getNome();
        this.tipoCorda = violao.getTipoCorda();
        this.qtdCordas = violao.getQtdCordas();
    }

    @Override
    public PrototipoViolao clonar() {
        return new Violao(this);
    }
}
