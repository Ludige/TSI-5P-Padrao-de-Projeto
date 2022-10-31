package ChainOfResponsability;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CharSequencial extends ChainCharacteres{

    public CharSequencial() {
    }

    @Override
    protected boolean verificarLogin(String nome,String senha) {

        Pattern charSenha = Pattern.compile(senha);
        Matcher matchSenha = charSenha.matcher("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrdtuvwxyz0123456789");

        if(!matchSenha.find()){
            System.out.println("Valido: Nenhuma Sequencia");
            return true;
        }

        System.out.println("Senha Invalida: Encontrada sequencia de caracteres");
        return false;
    }
}
