package ChainOfResponsability;

public class CharMaiusculo extends ChainCharacteres{

    public CharMaiusculo() {
    }

    @Override
    protected boolean verificarLogin(String nome,String senha) {
        String maiusculo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        int numCharSenha = senha.length();

        for(int i = 0; i < maiusculo.length(); i++){
            
            for(int x = 0; x < numCharSenha; x++){
                if(senha.charAt(x) == maiusculo.charAt(i)){
                    System.out.println("Valido: Caracter Maiusculo");
                    
                    return true;
                }
            }
        }
        System.out.println("Senha Invalida: Nenhuma letra Maiuscula");
        return false;
    }
}
