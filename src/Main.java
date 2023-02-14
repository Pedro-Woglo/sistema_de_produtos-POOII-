
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
                boolean abreMenuAdm = ValidarAdm.validaAdmLoginSenha(AdmLogin.loginAdm());
                if (abreMenuAdm) {
                    new MenuAdmClasseConcreta(listaProdutos).menuAdministrador();
                }
            }
            if (opcaoMenuInicial == 2) {
                boolean abreMenuCliente = ValidarCliente.validaClienteLoginSenha(ClienteCadastro.cadastroCliente(), ClienteLogin.loginCliente());
                if (abreMenuCliente) {
                    new MenuClienteClasseConcreta(sc,listaProdutos).menuCliente();
                }
            }
        } while (opcaoMenuInicial != 0);
    }
}


