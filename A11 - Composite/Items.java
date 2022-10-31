package Composite;

public abstract class Items {
    public String nome;
    public Float valor;

    //GSetters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract Float getValor();

    public void setValor(Float valor) {
        this.valor = valor;
    }

    //Metodos
    public abstract void addItems(Items item);
    public abstract void removerItem(Items item);
    public abstract void mostrarItems();
}
