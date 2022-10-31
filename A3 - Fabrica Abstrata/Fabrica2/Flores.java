package Fabrica2;

public abstract class Flores {
    public String nome;
    public String estacao;

    public void mostrarFlor(){
        System.out.println("Tipo de Flor: "+this.nome+ "\n"+
                            "Melhor Estação de Cultivo: "+this.estacao+"\n");
    }
}
