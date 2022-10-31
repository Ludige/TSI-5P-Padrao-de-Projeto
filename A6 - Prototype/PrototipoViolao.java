package Prototype;

public abstract class PrototipoViolao {
    protected String nome;
    protected String tipoCorda;
    protected Integer qtdCordas;


    public void exibirDescricao(){
        System.out.println("");
        System.out.println("Violão "+this.nome);
        System.out.println(this.qtdCordas +" Cordas de "+ this.tipoCorda);
    };

    public abstract PrototipoViolao clonar();
    
    public String getTipoCorda() {
        return this.tipoCorda;
    }

    public void setTipoCorda(String tipoCorda) {
        this.tipoCorda = tipoCorda;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQtdCordas() {
        return this.qtdCordas;
    }

    public void setQtdCordas(Integer qtdCordas) {
        this.qtdCordas = qtdCordas;
    }
}
