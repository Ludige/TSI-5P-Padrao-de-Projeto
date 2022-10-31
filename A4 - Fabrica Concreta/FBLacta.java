package AbstractFactory;

public class FBLacta extends FabricaChocolate{
    @Override
    public OvoAoLeite criarOvoAoLeite() {
        return new OvoAoLeite();
    }

    @Override
    public OvoOreo criarOvoOreo() {
        return new OvoOreo();
    }

    @Override
    public OvoSonhoDeValsa criarOvoSonhoDeValsa() {
        return new OvoSonhoDeValsa();
    }
}
