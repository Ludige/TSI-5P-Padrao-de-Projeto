package ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        ChainCharacteres login = new CharMaiusculo();
        login.setNext(new CharMinusculo());
        login.setNext(new CharEspecial());
        login.setNext(new CharNumerico());
        login.setNext(new CharSequencial());
        login.setNext(new CharMinimo());
        login.setNext(new CharMaximo());

        login.addUsers();

        try {
            login.efetuarLogin("Gabriel", "Dezesset3@");
            login.efetuarLogin("Rayslla","Agatinh4#");
            login.efetuarLogin("Jonas", "rupturA4#");
            login.efetuarLogin("Bruno", "Larxen3$");
            login.efetuarLogin("Bruno", "Laxen$");//Falha sem numero
            login.efetuarLogin("Italo", "abigail");//falha
        } catch (Exception e) {
            e.printStackTrace();
        }
        

    }
}
