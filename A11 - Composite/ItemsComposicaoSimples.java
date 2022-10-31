package Composite;

public class ItemsComposicaoSimples extends Items {

    public ItemsComposicaoSimples(String nome, Float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public Float getValor() {
        return this.valor;
    }

    @Override
    public void addItems(Items item) {
        System.out.println("A Implementação desse metodo não deveria ser feita nessa classe");
    }

    @Override
    public void removerItem(Items item) {
        System.out.println("A Implementação desse metodo não deveria ser feita nessa classe");
    }
    
    @Override
    public void mostrarItems() {
        System.out.println("Item: "+this.nome +"- Preço: "+this.valor);
    }
    
}
