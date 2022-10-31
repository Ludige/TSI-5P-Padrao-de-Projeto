package Builder.Componentes;

public class ConectorUSBC extends Partes implements iPreco {
    public ConectorUSBC(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
    
}
