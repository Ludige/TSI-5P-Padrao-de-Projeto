package ChainOfResponsability;

public class Usuario {
    public String nome;
    public String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public void mostrarUser(){
        System.out.println("Usuario: "+ this.nome+" - Senha: "+ this.senha);
    }

    //GSetters
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
