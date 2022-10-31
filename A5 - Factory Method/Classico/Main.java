package Classico;
public class Main {
    public static void main(String[] args) {
        ConcreteFactoryPessoa factory = new ConcreteFactoryPessoa();
        
        String nome = "Jose";
        String sexo = "m";
        
        factory.getPessoa(nome, sexo);
        
        nome = "Maria";
        sexo = "f";
        
        factory.getPessoa(nome, sexo);
    }
}
