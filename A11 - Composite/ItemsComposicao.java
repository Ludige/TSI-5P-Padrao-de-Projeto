package Composite;

import java.util.ArrayList;

public class ItemsComposicao extends Items{
    private ArrayList<Items> items = new ArrayList<>();

    @Override
    public Float getValor() {
        float total = 0;

        for(int i = 0;i < items.size();i++){
            total += items.get(i).getValor();
        }
        return total;
    }

    @Override
    public void addItems(Items item) {
        items.add(item);
    }

    @Override
    public void removerItem(Items item) {
        int posicao;
        
        posicao = this.items.indexOf(item);
        
        if(posicao != -1){
            this.items.remove(item);
        }
    }

    @Override
    public void mostrarItems() {
        for(int i = 0;i<items.size();i++){
            System.out.println("Item: "+items.get(i).nome +" - Preço: "+items.get(i).valor);
        }
    }
    
}
