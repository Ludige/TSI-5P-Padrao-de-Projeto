package Proxy;

public class ProxyLogin implements iLogin{
    private LoginReal login;
    private String nome;
    private String senha;


    public ProxyLogin(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    
    private LoginReal logarReal(){
        return new LoginReal(this.nome, this.senha);
    }

    @Override
    public void logar() {
        if(this.login == null){
            this.login = this.logarReal();
        }
        System.out.println("Logado em: "+ this.nome);
    }
}
