package Menus;

import Pessoas.Cliente;

import java.util.Scanner;

public class ClienteCadastro {

    private static Scanner sc = new Scanner(System.in);

    public ClienteCadastro(Scanner sc) {
        ClienteCadastro.sc = sc;
    }
    public static Cliente cadastroCliente() {
        System.out.println("-------Cadastro Cliente---------");
        System.out.print("Digite o login a ser cadastrado:");
        String loginCliente = sc.next();
        System.out.print("Digite a senha a ser cadastrada:");
        String senhaCliente = sc.next();
        System.out.print("Cadastro realizado com sucesso! Faça o seu login para acesso ao Menu. \n");
        return new Cliente(loginCliente, senhaCliente);
    }
}


