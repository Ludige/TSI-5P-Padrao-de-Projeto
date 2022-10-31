package Fabrica1;

public class FBNestle extends FabricaChocolate{
    @Override
    public OvoAlpino criarOvoAlpino() {
        return new OvoAlpino();
    }

    @Override
    public OvoKitkat criarOvoKitkat() {
        return new OvoKitkat();
    }

    @Override
    public OvoClassic criarOvoClassic() {
        return new OvoClassic();
    }
} 
