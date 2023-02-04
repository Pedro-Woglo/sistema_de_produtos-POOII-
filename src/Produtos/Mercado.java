package Produtos;

import Enums.EnumCategoria;
import Enums.EnumSecoesMercado;
import Interfaces.ProdutoAcoes;

import java.text.SimpleDateFormat;
import java.util.Date;


public class Mercado extends ProdutoAbstrato implements ProdutoAcoes {


    private Date dataValidade;
    private EnumSecoesMercado secoesMercado;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Mercado(String nome, Double preco, String marca, EnumCategoria categoria, Date dataValidade, EnumSecoesMercado secoesMercado) {
        super(nome, preco, marca, categoria);
        this.dataValidade= dataValidade;
        this.secoesMercado=secoesMercado;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public EnumSecoesMercado getSecoesMercado() {
        return secoesMercado;
    }

    public void setSecoesMercado(EnumSecoesMercado secoesMercado) {
        this.secoesMercado = secoesMercado;
    }

    @Override
    public void novaDoacao() {
        System.out.println("Doação para associações de bairro");
    }

    @Override
    public void fazerPromocao() {
        System.out.println("Nos produtos de higiene");
    }

    @Override
    public String toString() {
        return "Mercado{" +
                " Nome= " +getNome() +
                ", Preço=" + getPreco()+
                ", Marca= "+ getMarca()+
                ", Categoria "+ getCategoria()+
                ", Data de Validade=" + sdf.format(getDataValidade()) +
                ", Seções de Mercado=" + getSecoesMercado() +
                '}';
    }

    @Override
    public int compareTo(ProdutoAbstrato o) {
        return this.getNome().compareTo(o.getNome());
    }
}
