package Adapter;

public class AdapterBD implements iAdapter{
    private Usuario usuario;

    public AdapterBD(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void iniciarConexao(BancoDeDados bd) {
        if(bd != null){
            bd.conectar();
        }
    }

    @Override
    public void terminarConexao(BancoDeDados bd) {
        if(bd != null){
            bd.desconectar();
        }
        
    }

    //GSetter
    public Usuario getUsuario() {
        return this.usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
