package Menus;

import Pessoas.Cliente;

import java.util.Scanner;

public class ClienteLogin {

    private static Scanner sc;

    private static Cliente cliente;

    public ClienteLogin(Scanner sc) {
        this.sc = sc;
    }
    public static Cliente loginCliente() {
        System.out.println("-------Login Cliente---------");
        System.out.print("Digite o login:");
        String loginCliente = sc.next();
        System.out.print("Digite a senha:");
        String senhaCliente = sc.next();
        return cliente= new Cliente(loginCliente, senhaCliente);
    }
}


