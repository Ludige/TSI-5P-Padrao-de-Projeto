package Singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {    
        String nome;
        String senha;

        boolean continuar = true;

        Scanner ler = new Scanner(System.in);
        Log usuario = Log.getInstance("admin", "admin");

        do{
            usuario.MostrarUsuario();
            //
            System.out.println("\nDigite o nome de usuario:");
            nome = ler.nextLine();
            System.out.println("Digite a Senha:");
            senha = ler.nextLine();
            //
            usuario.login(nome, senha);

        }while(continuar);

        ler.close();
    }
}