package Composite;

import java.util.ArrayList;

public class Caixa {
    ArrayList<ItemsComposicaoSimples> items = new ArrayList<>();
    Float valor;

    private void addProdutos(){
        items.add(new ItemsComposicaoSimples("Quadrinhos",(float) 15));
        items.add(new ItemsComposicaoSimples("Chaveiros",(float) 5));
        items.add(new ItemsComposicaoSimples("Bustos",(float) 10));
        items.add(new ItemsComposicaoSimples("Adesivos",(float) 1));
        items.add(new ItemsComposicaoSimples("Poster",(float) 25));
        items.add(new ItemsComposicaoSimples("Camisa",(float) 25));
        items.add(new ItemsComposicaoSimples("Caneta",(float) 3));
        items.add(new ItemsComposicaoSimples("Miniaturas",(float) 20));
    }

    public ItemsComposicao gerarCaixaBronze(){
        ItemsComposicao caixaBronze = new ItemsComposicao();

        if(items.size() <= 0){
            addProdutos();
        }

        for(int i = 0; i < 3; i++){
            caixaBronze.addItems(items.get((int) (Math.random()*items.size())));
        }

        caixaBronze.mostrarItems();

        valor = caixaBronze.getValor();
        System.out.println("Valor da caixa Bronze: "+valor);

        return caixaBronze;
    }

    public ItemsComposicao gerarCaixaPrata(){
        ItemsComposicao caixaPrata = new ItemsComposicao();

        if(items.size() <= 0){
            addProdutos();
        }

        for(int i = 0; i < 5; i++){
            caixaPrata.addItems(items.get((int) (Math.random()*items.size())));
        }

        caixaPrata.mostrarItems();

        valor = caixaPrata.getValor();
        System.out.println("Valor da caixa Prata: "+valor);

        return caixaPrata;
    }

    public ItemsComposicao gerarCaixaOuro(){
        ItemsComposicao caixaOuro = new ItemsComposicao();

        if(items.size() <= 0){
            addProdutos();
        }

        for(int i = 0; i < 7; i++){
            caixaOuro.addItems(items.get((int) (Math.random()*items.size())));
        }

        caixaOuro.mostrarItems();

        valor = caixaOuro.getValor();
        System.out.println("Valor da caixa Ouro: "+valor);

        return caixaOuro;
    }

    public ItemsComposicao gerarCaixaPlatina(){
        ItemsComposicao caixaPlatina = new ItemsComposicao();

        caixaPlatina.addItems(gerarCaixaOuro());
        caixaPlatina.addItems(gerarCaixaBronze());

        valor = caixaPlatina.getValor();
        System.out.println("Valor da caixa Platina: "+valor);

        return caixaPlatina;
    }
}
