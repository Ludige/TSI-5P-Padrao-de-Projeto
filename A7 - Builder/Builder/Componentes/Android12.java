package Builder.Componentes;

public class Android12 extends Partes implements iPreco {
    public Android12(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
}
