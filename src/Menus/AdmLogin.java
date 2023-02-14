package Menus;

import Pessoas.Administrador;

import java.util.Scanner;

public class AdmLogin {

    private static Scanner sc = new Scanner(System.in);

        public AdmLogin(Scanner sc){
        AdmLogin.sc=sc;
    }

       public static Administrador loginAdm() {
           System.out.println("-------Login Administrador---------");
           System.out.print("Digite o login:");
           String loginAdm = sc.next();
           System.out.print("Digite a senha:");
           String senhaAdm = sc.next();
           return new Administrador(loginAdm,senhaAdm);
       }

}
