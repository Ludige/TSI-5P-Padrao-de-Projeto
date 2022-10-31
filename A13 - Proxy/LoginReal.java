package Proxy;

public class LoginReal implements iLogin{
    public String nome;
    public String senha;
    

    public LoginReal(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    @Override
    public void logar() {
        System.out.println("Logado em "+this.nome);
    }
}
