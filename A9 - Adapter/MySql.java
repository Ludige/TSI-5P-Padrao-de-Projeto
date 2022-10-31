package Adapter;

public class MySql extends BancoDeDados {
    public MySql(){
        super("mysql","mysql");
    }

    @Override
    public void conectar() {
        super.conectar();
        System.out.println("Conexão iniciada com MySQL");
    }

    @Override
    public void desconectar() {
        super.desconectar();
        System.out.println("Conexão encerrada com MySQL");
    }
}