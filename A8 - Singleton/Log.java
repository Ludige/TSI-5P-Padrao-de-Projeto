package Singleton;

import java.util.Scanner;

public class Log {
    public static String nome;
    public static String senha;
    
    public static Log instancia;
    private boolean logado;//Define se está logado ou não

    Scanner ler = new Scanner(System.in);

    private Log(String nome, String senha) {
        Log.nome = nome;
        Log.senha = senha;
    }

    public static synchronized Log getInstance(String nome, String senha){
        if(instancia == null){ //Se instancia não existe
            instancia = new Log(nome,senha);//Cria nova instancia
        }
        return instancia;
    }

    public void definirLog(){
        logado = !logado;
    }

    public void login(String nome, String senha){
        boolean usuarioValido = (Log.nome.equals(nome) && Log.senha.equals(senha));

        if(usuarioValido && !logado){
            boolean captchaValido = false;
            String captchaGerado;
            String captcha;

            do{//Testar Captcha
                captchaGerado = gerarCaptcha();//Gera Captcha
                System.out.println("Digite o Captcha: "+captchaGerado);
                captcha = ler.nextLine();
                
                if(captcha.equals(captchaGerado)){//Compara Captcha
                    captchaValido = true;
                }else{
                    System.out.println("Captcha Invalido, tente novamente");
                }

            }while(!captchaValido);//Continua até o Usuario digitar certo

            definirLog();
            System.out.println("Usuario " + nome +" logado com sucesso");
        }
    }

    public void logout(){//Falta implementar verificações
        if(logado){
            System.out.println("Realizando Log Out");
            instancia = null;
            definirLog();
        }
    }

    private String gerarCaptcha(){
        String captcha = "";

        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for(int i = 0; i < 5; i++){
            captcha += caracteres.charAt((int) Math.floor(Math.random() * caracteres.length()));
        }
        return captcha;
    }

    public void MostrarUsuario(){//Metodo só pra facilitar o console
        System.out.println("Usuario: | "+ Log.nome + " | Senha: | "+ Log.senha+ " |");
    }

    //GSetter

    public boolean isLogado() {
        return this.logado;
    }

    public boolean getLogado() {
        return this.logado;
    }

    public void setLogado(boolean logado) {
        this.logado = logado;
    }

}
