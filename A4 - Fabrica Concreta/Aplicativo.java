package AbstractFactory;

public class Aplicativo {
    public static void main(String[] args) {
        //Nestle
        System.out.println("Nestle:");
        FabricaChocolate fabrica1 = new FBNestle();

        System.out.println("***************************");
        Ovos ovoAlpino = fabrica1.criarOvoAlpino();

        ovoAlpino.exibirOvo();

        System.out.println("***************************");
        Ovos ovoClassico = fabrica1.criarOvoClassic();

        ovoClassico.exibirOvo();

        System.out.println("***************************");
        Ovos ovoKitKat = fabrica1.criarOvoKitkat();

        ovoKitKat.exibirOvo();

        //Garoto
        System.out.println("\n \n"+"Garoto:");
        
        FabricaChocolate fabrica2 = new FBGaroto();

        System.out.println("***************************");
        Ovos ovoCrocante = fabrica2.criarOvoCrocante();

        ovoCrocante.exibirOvo();

        System.out.println("***************************");
        Ovos ovoTalento = fabrica2.criarOvoTalento();

        ovoTalento.exibirOvo();

        System.out.println("***************************");
        Ovos ovoBaton = fabrica2.criarOvoBaton();

        ovoBaton.exibirOvo();

        //Lacta
        System.out.println("\n \n"+"Lacta:");

        FabricaChocolate fabrica3 = new FBLacta();

        System.out.println("***************************");
        Ovos ovoAoLeite = fabrica3.criarOvoAoLeite();

        ovoAoLeite.exibirOvo();

        System.out.println("***************************");
        Ovos ovoOreo = fabrica3.criarOvoOreo();

        ovoOreo.exibirOvo();

        System.out.println("***************************");
        Ovos ovoSonho = fabrica3.criarOvoSonhoDeValsa();

        ovoSonho.exibirOvo();
        


    }
}

