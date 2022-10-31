package Builder.Construcao;

import Builder.Componentes.Android11;
import Builder.Componentes.Bateria4500h;
import Builder.Componentes.Camera48Mp;
import Builder.Componentes.ConectorUSB;
import Builder.Componentes.Partes;
import Builder.Componentes.Processador4GB;
import Builder.Componentes.TelaVidroPadrao;

public class BuilderCelularLinhaB implements iBuilderCelular{
    public Celular celular = new Celular();

    @Override
    public Celular construir() {
        Partes sistemaOperacional = new Android11("Android 11: Red Velvet Cake", 400);
        this.celular.addParte(sistemaOperacional);

        Partes bateria = new Bateria4500h("Bateria LiPo", 300);
        this.celular.addParte(bateria);

        Partes camera = new Camera48Mp("Camera 48 + 12 Mp", 220);
        this.celular.addParte(camera);

        Partes conectorUSB = new ConectorUSB("USB padrão + Conector P2", 110);
        this.celular.addParte(conectorUSB);

        Partes processador = new Processador4GB("Processador Quadradum, 4GB", 250);
        this.celular.addParte(processador);

        Partes tela = new TelaVidroPadrao("Vidro", 100);
        this.celular.addParte(tela);
        
        return this.celular;
    }
}
