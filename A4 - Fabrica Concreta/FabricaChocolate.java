package AbstractFactory;

public abstract class FabricaChocolate {
    //Nestle
    public OvoAlpino criarOvoAlpino(){return new OvoAlpino();};
    public OvoKitkat criarOvoKitkat(){return new OvoKitkat();};
    public OvoClassic criarOvoClassic(){return new OvoClassic();};
    //Garoto
    public OvoCrocante criarOvoCrocante(){return new OvoCrocante();};
    public OvoTalento criarOvoTalento(){return new OvoTalento();};
    public OvoBaton criarOvoBaton(){return new OvoBaton();};
    //Lacta
    public OvoAoLeite criarOvoAoLeite(){return new OvoAoLeite();};
    public OvoOreo criarOvoOreo(){return new OvoOreo();};
    public OvoSonhoDeValsa criarOvoSonhoDeValsa(){return new OvoSonhoDeValsa();};
    
}
