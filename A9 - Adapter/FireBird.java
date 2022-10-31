package Adapter;

public class FireBird extends BancoDeDados {
    public FireBird(){
        super("firebird","firebird");
    }

    @Override
    public void conectar() {
        super.conectar();
        System.out.println("Conexão iniciada com FireBird");
    }

    @Override
    public void desconectar() {
        super.desconectar();
        System.out.println("Conexão encerrada com FireBird");
    }
}
