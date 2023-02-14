package Pagamentos;

import Enums.EnumFormaDePagamento;

public class AntiFraude {

    public static void verificaFraude(EnumFormaDePagamento formaDePagamento, Double preco){

        if(formaDePagamento.toString() == "CARTAODECREDITO" && preco >= 2000){
            throw new RuntimeException("Pagamento rejeitado! (Valor excedido)");
        }
        
        if(formaDePagamento.toString() == "PIX" && preco >= 1000){
            throw new RuntimeException("Pagamento rejeitado! (Valor excedido)");
        }

        System.out.println("Pagamento aprovado!");
    }
    
}