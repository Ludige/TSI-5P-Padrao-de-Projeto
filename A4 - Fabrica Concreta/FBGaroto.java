package AbstractFactory;

public class FBGaroto extends FabricaChocolate{
    @Override
    public OvoCrocante criarOvoCrocante() {
        return new OvoCrocante();
    }

    @Override
    public OvoTalento criarOvoTalento() {
        return new OvoTalento();
    }

    @Override
    public OvoBaton criarOvoBaton() {
        return new OvoBaton();
    }
}
