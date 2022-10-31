package Builder.Componentes;

public class Processador6GB extends Partes implements iPreco {
    public Processador6GB(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
    
}
