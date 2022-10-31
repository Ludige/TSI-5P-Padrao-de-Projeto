package Classico;

public class ConcreteFactoryPessoa implements FactoryPessoa{
    @Override
    public Pessoa getPessoa(String nome, String sexo) {
        if(sexo.equals("m")){
            return new Homem(nome);
        }else{
            return new Mulher(nome);
        }
    }
}
