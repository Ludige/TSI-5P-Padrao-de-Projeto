package AbstractFactory;

public class FBNestle extends FabricaChocolate{
    @Override
    public OvoAlpino criarOvoAlpino() {
        return new OvoAlpino();
    }

    @Override
    public OvoClassic criarOvoClassic() {
        return new OvoClassic();
    }

    @Override
    public OvoKitkat criarOvoKitkat() {
        return new OvoKitkat();
    }
} 
