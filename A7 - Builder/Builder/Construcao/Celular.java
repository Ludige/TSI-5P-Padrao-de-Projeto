package Builder.Construcao;

import java.util.ArrayList;

import Builder.Componentes.Partes;
import Builder.Componentes.iPreco;

public class Celular extends Partes implements iPreco{
    public ArrayList<Partes> partes = new ArrayList<Partes>();

    public void addParte(Partes componente){
        partes.add(componente);
    }

    @Override
    public float calcPreco() {
        this.preco = 0;
        
        for(int i = 0; i < partes.size(); i++){
            this.preco += partes.get(i).preco;
        }

        return this.preco;
    }

    public void exibirFichaTecnica(){
        for(int i = 0; i < partes.size(); i++){
            System.out.println(partes.get(i).getNome() + ", de preço: "+ partes.get(i).getPreco() +"R$;");
        }
        System.out.println("Preço Final: "+ calcPreco());
    }

}
