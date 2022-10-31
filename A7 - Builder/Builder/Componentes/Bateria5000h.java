package Builder.Componentes;

public class Bateria5000h extends Partes implements iPreco {
    public Bateria5000h(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public float calcPreco(){
        return this.preco;
    }
    
}
