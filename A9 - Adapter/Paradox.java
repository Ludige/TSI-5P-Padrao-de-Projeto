package Adapter;

public class Paradox extends BancoDeDados{
    public Paradox(){
        super("paradox","paradox");
    }

    @Override
    public void conectar() {
        super.conectar();
        System.out.println("Conexão iniciada com Paradox");
    }

    @Override
    public void desconectar() {
        super.desconectar();
        System.out.println("Conexão encerrada com Paradox");
    }
}
