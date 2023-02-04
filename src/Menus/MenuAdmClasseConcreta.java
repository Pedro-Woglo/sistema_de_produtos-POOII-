package Menus;

import Produtos.ProdutoAbstrato;

import java.util.List;
import java.util.Scanner;

public class MenuAdmClasseConcreta extends MenuAdmAbstract {

    public MenuAdmClasseConcreta(Scanner sc, List<ProdutoAbstrato> listaProdutos) {
        super(sc, listaProdutos);
    }

    public  void menuAdministrador() {
        int opcaoMenuAdm;
        do {
            System.out.println("-----Menu Administrador ------: ");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Visualizar produtos");
            System.out.println("3 - Editar produto");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Retornar ao Menu Inicial");
            System.out.println("Entre com a opção desejada: ");
             opcaoMenuAdm = sc.nextInt();
            switch (opcaoMenuAdm) {
                case 0:
                    System.out.println("Retornando ao Menu Inicial");
                    break;
                case 1:
                    cadastrarProdutos();
                    break;
                case 2:
                    visualizarProdutos();
                    break;
                case 3:
                    editarProdutos();
                    break;
                case 4:
                    removerProdutos();
                    break;
            }
        }while(opcaoMenuAdm!=0);
    }
}
