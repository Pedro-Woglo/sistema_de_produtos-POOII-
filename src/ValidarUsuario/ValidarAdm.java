package ValidarUsuario;

import Pessoas.Administrador;

public class ValidarAdm {

    public static boolean validaAdmLoginSenha(Administrador administrador) {
        if (administrador.getLogin().equals("lol") && administrador.getSenha().equals("123")) {
            System.out.println("Login de administrador realizado com sucesso!");
            return true;
        } else {
            System.out.println("Login ou senha inválidos");
            return false;
        }
    }
}


