package Builder.Componentes;

public class Processador4GB extends Partes implements iPreco {
    public Processador4GB(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
    
}
