package Fabrica2;

public class JdLirios extends Floricultura{
    @Override
    public FlorLirioBranco criarLirioBranco(){
        return new FlorLirioBranco();
    }
    
    @Override
    public FlorLirioOriental criarLirioOriental(){
        return new FlorLirioOriental();
    }
}
