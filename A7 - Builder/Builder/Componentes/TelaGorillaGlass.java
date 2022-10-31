package Builder.Componentes;

public class TelaGorillaGlass extends Partes implements iPreco {
    public TelaGorillaGlass(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
    
}
