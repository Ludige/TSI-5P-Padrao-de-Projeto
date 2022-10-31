package Builder.Construcao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Celular celular = new Celular();

        int escolherCelular;
        boolean continuar = true;

        do {
            System.out.println("------------------------------------------");
            System.out.println("Escolha o tipo de Celular para exibir:");
            System.out.println("1: Celular linha S");
            System.out.println("2: Celular linha A");
            System.out.println("3: Celular linha B");
            System.out.println("0: Sair");
            System.out.println("------------------------------------------");

            escolherCelular = ler.nextInt();

            switch (escolherCelular){
                case 1:
                    iBuilderCelular celularS = new BuilderCelularLinhaS();
                    celular = celularS.construir();
                    celular.exibirFichaTecnica();
                    break;            
                case 2:
                    iBuilderCelular celularA = new BuilderCelularLinhaA();
                    celular = celularA.construir();
                    celular.exibirFichaTecnica();
                    break;            
                case 3:
                    iBuilderCelular celularB = new BuilderCelularLinhaB();
                    celular = celularB.construir();
                    celular.exibirFichaTecnica();
                    break;
                case 0:
                    System.out.println("Saindo... ");
                    continuar = false;
                    break;
                default:
                    System.out.println("Modelo inexistente ou Indisponivel...");
                    break;
            }
        }while(continuar);

        ler.close();
    }
}
