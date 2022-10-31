package Builder.Componentes;

public class Camera48Mp extends Partes implements iPreco {
    public Camera48Mp(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
    
}
