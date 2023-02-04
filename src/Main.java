
import Menus.*;
import Produtos.ProdutoAbstrato;
import ValidarUsuario.ValidarAdm;
import ValidarUsuario.ValidarCliente;

import java.util.*;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcaoMenuInicial;
        List<ProdutoAbstrato> listaProdutos= new ArrayList<>();

        do {
            MenuInicial.menuInicial();
            opcaoMenuInicial = sc.nextInt();
            if (opcaoMenuInicial == 1) {
                boolean abreMenuAdm = ValidarAdm.validaAdmLoginSenha(new AdmLogin(sc).loginAdm());
                if (abreMenuAdm) {
                    new MenuAdmClasseConcreta(sc, listaProdutos).menuAdministrador();
                }
            }
            if (opcaoMenuInicial == 2) {
                boolean abreMenuCliente = ValidarCliente.validaClienteLoginSenha(new ClienteCadastro(sc).cadastroCliente(), new ClienteLogin(sc).loginCliente());
                if (abreMenuCliente) {
                    new MenuClienteClasseConcreta(sc,listaProdutos).menuCliente();
                }
            }
        } while (opcaoMenuInicial != 0);
    }
}


