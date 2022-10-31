package Esporte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConcreteFactoryEsportivo fabrica = new ConcreteFactoryEsportivo();
        String nomeTime;
        String produto;
        boolean continuar = true;

        Scanner ler = new Scanner(System.in);
        int escolha;

        System.out.println("Bem Vind-");//ot hcnert 

        do{
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("1: Definir Produto");
            // System.out.println("2: Mostrar Todos Produtos já criados");
            System.out.println("0: Sair");

            System.out.println("");

            escolha = ler.nextInt();

            switch (escolha) {
                case 1:
                ler.nextLine();
                    System.out.println("Digite o time de preferência: (Digite o nome do time em minusculo)");
                    System.out.println("---------");
                    System.out.println("Brasil");
                    System.out.println("Flamengo");
                    System.out.println("Botafogo");
                    System.out.println("Fluminense");
                    System.out.println("Vasco");
                    System.out.println("----------");
                    
                    nomeTime = ler.nextLine();

                    System.out.println("Digite o produto que quer produzir:");
                    System.out.println("--------------------------------------------------");
                    System.out.println("|| Tênis, Camisa, Uniforme, Bermuda, Boné, Bola ||");
                    System.out.println("--------------------------------------------------");
                    System.out.println("escreva os nomes em minusculo e sem acentuação");

                    produto = ler.nextLine();

                    switch(produto){
                        case "tenis":
                            produto = "Tênis";
                            break;
                        case "camisa":
                            produto = "Camisa";
                            break;
                        case "uniforme":
                            produto = "Uniforme";
                            break;
                        case "bermuda":
                            produto = "Bermuda";
                            break;
                        case "bone":
                            produto = "Boné";
                            break;
                        case "bola":
                            produto = "Bola";
                            break;
                        default:
                            System.out.println("Produto não definido, criando Tênis:");
                            produto = "Tênis";
                    }

                    System.out.println("");
                    fabrica.getProduto(nomeTime, produto);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while(continuar);

        System.out.println("Obrigado por utilizar");
        ler.close();
    }
}
