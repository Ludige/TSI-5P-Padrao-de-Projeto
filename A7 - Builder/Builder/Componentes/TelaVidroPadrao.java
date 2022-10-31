package Builder.Componentes;

public class TelaVidroPadrao extends Partes implements iPreco {
    public TelaVidroPadrao(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
    
}
