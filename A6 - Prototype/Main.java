package Prototype;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Violao protViolao = new Violao("Prototipo","PrototipoCorda",0);
        
        Integer tipoViolao;

        boolean continuar = true;

        //Classico
        PrototipoViolao classico = protViolao.clonar();
        classico.setNome("Classico");
        classico.setTipoCorda("Nylon");
        classico.setQtdCordas(6);

        //Folk
        PrototipoViolao folk = protViolao.clonar();
        folk.setNome("Folk");
        folk.setTipoCorda("Aço");
        folk.setQtdCordas(6);
        
        //Flet
        PrototipoViolao flat = protViolao.clonar();
        flat.setNome("Flat"); //Flat
        flat.setTipoCorda("Nylon");
        flat.setQtdCordas(7);

        //Jumbo
        PrototipoViolao jumbo = protViolao.clonar();
        jumbo.setNome("Jumbo");
        jumbo.setTipoCorda("Aço");
        jumbo.setQtdCordas(12);

        //Sete
        PrototipoViolao sete = protViolao.clonar();
        sete.setNome("Sete Cordas");
        sete.setTipoCorda("Nylon");
        sete.setQtdCordas(7);

        //
        PrototipoViolao doze = protViolao.clonar();
        doze.setNome("Doze Cordas");
        doze.setTipoCorda("Nylon");
        doze.setQtdCordas(12);

        //Parlor
        PrototipoViolao parlor = protViolao.clonar();
        parlor.setTipoCorda("Aço");
        parlor.setQtdCordas(6);


        do{
            System.out.println("----------------------------------------------");
            System.out.println("Digite o nome do modelo que deseja exibir:");
            System.out.println("1: Classico");
            System.out.println("2: Folk");
            System.out.println("3: Flat");
            System.out.println("4: Jumbo");
            System.out.println("5: Sete cordas");
            System.out.println("6: Doze cordas");
            System.out.println("7: Parlor");
            System.out.println("0: Sair");
            System.out.println("----------------------------------------------");


            tipoViolao = ler.nextInt();
            switch (tipoViolao) {
                case 1:
                    classico.exibirDescricao();
                    break;
                case 2:
                    folk.exibirDescricao();
                    break;
                case 3:
                    flat.exibirDescricao();
                    break;
                case 4:
                    jumbo.exibirDescricao();
                    break;
                case 5:
                    sete.exibirDescricao();
                    break;
                case 6:
                    doze.exibirDescricao();
                    break;
                case 7:
                    ler.nextLine();
                    System.out.println("Escolha o tipo:");
                    System.out.println("1: Zero Unico");
                    System.out.println("2: Zero duplo");
                    System.out.println("3: Zero triplo");

                    tipoViolao = ler.nextInt();

                    switch (tipoViolao) {
                        case 1:
                            parlor.setNome("Parlor, Zero Unico");
                            break;
                        case 2:
                            parlor.setNome("Parlor, Zero Duplo");
                            break;
                        case 3:
                            parlor.setNome("Parlor, Zero Triplo");
                            break;
                        default:
                            System.out.println("~- Opção invalida -~");
                            parlor.setNome("Parlor, Zero não identificado");
                            break;
                    }

                    parlor.exibirDescricao();
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
        
        ler.close();
    }
}
