package Fabrica1;

public abstract class FabricaChocolate {
    //Nestle
    public OvoAlpino criarOvoAlpino(){return new OvoAlpino();};
    public OvoKitkat criarOvoKitkat(){return new OvoKitkat();};
    public OvoClassic criarOvoClassic(){return new OvoClassic();};

    //Lacta
    public OvoAoLeite criarOvoAoLeite(){return new OvoAoLeite();};
    public OvoOreo criarOvoOreo(){return new OvoOreo();};
    public OvoSonhoDeValsa criarOvoSonhoDeValsa(){return new OvoSonhoDeValsa();};
    
}
