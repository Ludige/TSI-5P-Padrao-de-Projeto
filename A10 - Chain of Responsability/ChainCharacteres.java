package ChainOfResponsability;

import java.util.ArrayList;

public abstract class ChainCharacteres {
    protected ChainCharacteres proximoVerificador;

    private ArrayList<Usuario> usuarios = new ArrayList<>();

    //User
    public void addUsers(){
        usuarios.add(new Usuario("Gabriel", "Dezesset3@"));
        usuarios.add(new Usuario("Rayslla","Agatinh4#"));
        usuarios.add(new Usuario("Jonas", "rupturA4#"));
        usuarios.add(new Usuario("Bruno", "Larxen3$"));
    }

    public void mostrarCliente(String nome){
        for(int i = 0; i < usuarios.size(); i++){
            if(usuarios.get(i).getNome().equals(nome)){
                usuarios.get(i).mostrarUser();
            }
        }
    }
    
    //Chain
    public ChainCharacteres() {
        this.proximoVerificador = null;
    }

    public void setNext(ChainCharacteres proximoVerificador){
        if(this.proximoVerificador == null){
            this.proximoVerificador = proximoVerificador;
        }else{
            this.proximoVerificador.setNext(proximoVerificador);
        }
    }
    
    public void efetuarLogin(String nome, String senha){
        if(usuarios.size() < 1){//Só por garantia
            addUsers();
        }

        for(int i = 0; i < usuarios.size(); i++){

            if(usuarios.get(i).getNome().equals(nome)){

                if(verificarLogin(nome,senha) && proximoVerificador != null){
                    proximoVerificador.efetuarLogin(nome, senha);
                }
            }
        }
    }

    protected abstract boolean verificarLogin(String nome, String senha);

    //GSetters
    public ChainCharacteres getProximoVerificador() {
        return this.proximoVerificador;
    }

    public void setProximoVerificador(ChainCharacteres proximoVerificador) {
        this.proximoVerificador = proximoVerificador;
    }

    public ArrayList<Usuario> getUsuarios() {
        return this.usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}
