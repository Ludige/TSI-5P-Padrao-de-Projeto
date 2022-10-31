package Builder.Componentes;

public class Bateria4500h extends Partes implements iPreco {
    public Bateria4500h(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
    
}
