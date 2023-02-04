package ValidarUsuario;

import Pessoas.Cliente;

public class ValidarCliente {

    public static boolean validaClienteLoginSenha(Cliente cliente, Cliente cliente2){
        if(cliente.getLogin().equals(cliente2.getLogin())&&cliente.getSenha().equals(cliente2.getSenha())){
            System.out.println("Login de cliente realizado com sucesso!");
            return true;
        } else{
            System.out.println("Login ou senha inválidos");
            return false;
        }
    }
}