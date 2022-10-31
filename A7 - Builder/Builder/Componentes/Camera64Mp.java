package Builder.Componentes;

public class Camera64Mp extends Partes implements iPreco {
    public Camera64Mp(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco() {
        return this.preco;
    }
    
}
