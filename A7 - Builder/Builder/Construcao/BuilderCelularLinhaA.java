package Builder.Construcao;

import Builder.Componentes.Android12;
import Builder.Componentes.Bateria5000h;
import Builder.Componentes.Camera64Mp;
import Builder.Componentes.ConectorUSBC;
import Builder.Componentes.Partes;
import Builder.Componentes.Processador6GB;
import Builder.Componentes.TelaGorillaGlass;

public class BuilderCelularLinhaA implements iBuilderCelular{
    public Celular celular = new Celular();

    @Override
    public Celular construir() {
        Partes sistemaOperacional = new Android12("Android 12: Snow Cone", 400);
        this.celular.addParte(sistemaOperacional);

        Partes bateria = new Bateria5000h("Bateria LiPo", 350);
        this.celular.addParte(bateria);

        Partes camera = new Camera64Mp("Camera 64 + 8 Mp", 210);
        this.celular.addParte(camera);

        Partes conectorUSB = new ConectorUSBC("USB-C + Conector P2", 130);
        this.celular.addParte(conectorUSB);

        Partes processador = new Processador6GB("Processador Snapdragon 720, 6GB", 500);
        this.celular.addParte(processador);

        Partes tela = new TelaGorillaGlass("Gorilla Glass 2", 250);
        this.celular.addParte(tela);
        
        return this.celular;
    }
}
