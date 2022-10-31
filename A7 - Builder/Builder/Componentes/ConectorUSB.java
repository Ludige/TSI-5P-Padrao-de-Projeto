package Builder.Componentes;

public class ConectorUSB extends Partes implements iPreco {
    public ConectorUSB(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
    
}
