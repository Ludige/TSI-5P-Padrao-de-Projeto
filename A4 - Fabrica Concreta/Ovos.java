package AbstractFactory;

public abstract class Ovos {
    public String nome;
    public String peso;
    public String corEmbalagem;
    public String tipoRecheio;
    public String casca;

    public void exibirOvo(){
        System.out.println("Nome: "+this.nome +"\n"+
                            "Peso: "+this.peso +"\n"+
                            "Cor da Embalagem: "+this.corEmbalagem +"\n"+
                            "Tipo de Recheio: "+this.tipoRecheio +"\n"+
                            "Casca do Ovo: "+this.casca
        );
    }
}
