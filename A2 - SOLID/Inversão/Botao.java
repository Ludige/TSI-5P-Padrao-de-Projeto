package Inversão;

public class Botao{
    private LigarDesligar dispositivo;
    private boolean ativo = false;
    //Construtor

    public Botao(LigarDesligar dispositivo) {
        this.dispositivo = dispositivo;
    }

    //Metodo
    public void ativar(){
        if(ativo == false){
            this.dispositivo.Ligar();
            this.ativo = true;
        }else{
            this.dispositivo.Desligar();
            this.ativo = false;
        }
    }

    //GSetter
    public LigarDesligar getDispositivo() {
        return this.dispositivo;
    }

    public void setDispositivo(LigarDesligar dispositivo) {
        this.dispositivo = dispositivo;
    }

}
