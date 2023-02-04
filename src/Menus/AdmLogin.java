package Menus;

import Pessoas.Administrador;

import java.util.Scanner;

public class AdmLogin {

    private Scanner sc;

     Administrador administrador;
    public AdmLogin(Scanner sc){
        this.sc=sc;}

       public Administrador loginAdm() {
           System.out.println("-------Login Administrador---------");
           System.out.print("Digite o login:");
           String loginAdm = sc.next();
           System.out.print("Digite a senha:");
           String senhaAdm = sc.next();
           return administrador = new Administrador(loginAdm,senhaAdm);
       }

}
