package Fabrica2;

public class JdOrquideas extends Floricultura{
    @Override
    public FlorOrquideaPadrao criarOrquideaPadrao(){
        return new FlorOrquideaPadrao();
    }

    @Override
    public FlorOrquideaRajada criarOrquideaRajada(){
        return new FlorOrquideaRajada();
    }
}
