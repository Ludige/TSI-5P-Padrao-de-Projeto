package Fabrica2;

public abstract class Floricultura {
    public FlorOrquideaPadrao criarOrquideaPadrao(){return new FlorOrquideaPadrao();}
    public FlorOrquideaRajada criarOrquideaRajada(){return new FlorOrquideaRajada();}

    public FlorRosaBranca criarRosaBranca(){return new FlorRosaBranca();}
    public FlorRosaVermelha criaRosaVermelha(){return new FlorRosaVermelha();}

    public FlorLirioBranco criarLirioBranco(){return new FlorLirioBranco();}
    public FlorLirioOriental criarLirioOriental(){return new FlorLirioOriental();}
}
