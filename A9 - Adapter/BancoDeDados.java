package Adapter;

public class BancoDeDados {
    private String nome;
    private String senha;
    private Boolean conectado = false;
        
    public BancoDeDados() {
    }

    public BancoDeDados( String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public void conectar(){
        if(!this.conectado){
            this.conectado = true;
            System.out.println("Conexão Estabelecida");
        }else{
            System.out.println("Conexão já existente");
        }
    }

    public void desconectar(){
        if(this.conectado){
            this.conectado = false;
            System.out.println("Banco desconectado");
        }else{
            System.out.println("Nenhuma conexão existente");
        }
    }

    //GSetter
    public Boolean isConectado() {
        return this.conectado;
    }

    public Boolean getConectado() {
        return this.conectado;
    }

    public void setConectado(Boolean conectado) {
        this.conectado = conectado;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
