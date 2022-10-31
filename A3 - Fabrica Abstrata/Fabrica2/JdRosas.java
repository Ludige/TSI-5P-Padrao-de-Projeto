package Fabrica2;

public class JdRosas extends Floricultura{
    @Override
    public FlorRosaBranca criarRosaBranca(){
        return new FlorRosaBranca();
    }

    @Override
    public FlorRosaVermelha criaRosaVermelha(){
        return new FlorRosaVermelha();
    }
}
