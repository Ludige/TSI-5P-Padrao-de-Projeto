package Builder.Componentes;

public class Android11 extends Partes implements iPreco {
    public Android11(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
}
