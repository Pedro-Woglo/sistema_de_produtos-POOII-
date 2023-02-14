package Menus;

import Enums.EnumCategoria;
import Enums.EnumFormaDePagamento;
import Interfaces.MenuClienteAcoes;
import Pagamentos.AntiFraude;
import Produtos.ProdutoAbstrato;

import java.util.*;

public abstract class MenuClienteAbstract implements MenuClienteAcoes  {

    protected static Scanner sc;

    protected List<ProdutoAbstrato> listaProdutos = new ArrayList<>();

    public MenuClienteAbstract(Scanner sc, List<ProdutoAbstrato> listaProdutos) {
        this.listaProdutos = listaProdutos;
        MenuClienteAbstract.sc = sc;
    }

    @Override
    public void visualizarProdutos() {
        if (listaProdutos.isEmpty()){
            System.out.println("Não há produtos cadastrados no momento!");
        }
        else{
            for (ProdutoAbstrato produto : listaProdutos) {
                System.out.println(produto);
            }
        }
    }

    @Override
    public void filtrarPorCategoria() {
        System.out.println("Filtrar pela categoria: (m)Mercado/ (l)Livro/ (i)Informática");
        char opcaoFiltroPorCategoria = sc.next().charAt(0);
        boolean aux = true;
        if (opcaoFiltroPorCategoria == 'm') {
            for (ProdutoAbstrato produto : listaProdutos) {
                if (produto.getCategoria().equals(EnumCategoria.MERCADO)) {
                    aux = false;
                    System.out.println(produto);
                }
            }
        }
        if (opcaoFiltroPorCategoria == 'l') {
            for (ProdutoAbstrato produto : listaProdutos) {
                if (produto.getCategoria().equals(EnumCategoria.LIVRO)) {
                    aux = false;
                    System.out.println(produto);
                }
            }
        }
        if (opcaoFiltroPorCategoria == 'i') {
            for (ProdutoAbstrato produto : listaProdutos) {
                if (produto.getCategoria().equals(EnumCategoria.INFORMATICA)) {
                    aux = false;
                    System.out.println(produto);
                }
            }
        }
        if(aux == true){
            System.out.println("Categoria inexistente!");
        }
    }

    @Override
    public void filtrarPorMarca() {
        System.out.println("Digite a marca:");
        String opcaoFiltrarPorMarca = sc.next();
        boolean aux = true;
        for (ProdutoAbstrato produto : listaProdutos) {
            if (produto.getMarca().equals(opcaoFiltrarPorMarca)) {
                aux = false;
                System.out.println(produto);
            }
        }
        if(aux == true){
            System.out.println("Marca não registrada!");
        }
    }

    @Override
    public void ordenarPorNome() {
        System.out.println("Ordenar a lista por nome na ordem crescente ou descrescente? (c/d)");
        char opcaoOrdemNome = sc.next().charAt(0);
        if (opcaoOrdemNome == 'c') {
            Collections.sort(listaProdutos);
            for (ProdutoAbstrato produto : listaProdutos) {
                System.out.println(produto);
            }
        }
        if (opcaoOrdemNome == 'd') {
            Collections.reverse(listaProdutos);
            for (ProdutoAbstrato produto : listaProdutos) {
                System.out.println(produto);
            }
        }
    }

    @Override
    public void ordenarPorPreco() {
        System.out.println("Ordenar a lista por preço na ordem crescente ou descrescente? (c/d)");
        char opcaoOrdemPreco = sc.next().charAt(0);
        if (opcaoOrdemPreco == 'c') {
            Collections.sort(listaProdutos, Comparator.comparing(ProdutoAbstrato::getPreco));
            for (ProdutoAbstrato produto : listaProdutos) {
                System.out.println(produto);
            }
        }
        if (opcaoOrdemPreco == 'd') {
            Collections.reverse(listaProdutos);
            for (ProdutoAbstrato produto : listaProdutos) {
                System.out.println(produto);
            }
        }

    }

    @Override
    public void selecionarFormaDePagamento(){
        Double preco = 0d;
        if(listaProdutos.isEmpty()){
            System.out.println("Não há produtos no carrinho!");
        }
        else{
            for(ProdutoAbstrato produto : listaProdutos){
                preco += produto.getPreco();
            }
            System.out.println("Valor total: R$" + preco);
            System.out.println("Selecione a forma de pagamento: (b)Boleto/ (p)PIX/ (c)Cartão de crédito/ (f)Faturamento");
            char opcaoPagamento = sc.next().charAt(0);
            boolean aux = true;
            if (opcaoPagamento == 'b') {
                aux = false;
                AntiFraude.verificaFraude(EnumFormaDePagamento.BOLETO, preco);
                listaProdutos.removeAll(listaProdutos);
            }
            if (opcaoPagamento == 'p') {
                aux = false;
                AntiFraude.verificaFraude(EnumFormaDePagamento.PIX, preco);
                listaProdutos.removeAll(listaProdutos);
            }
            if (opcaoPagamento == 'c') {
                aux = false;
                AntiFraude.verificaFraude(EnumFormaDePagamento.CARTAODECREDITO, preco);
                listaProdutos.removeAll(listaProdutos);
            }
            if (opcaoPagamento == 'f') {
                aux = false;
                AntiFraude.verificaFraude(EnumFormaDePagamento.FATURAMENTO, preco);
                listaProdutos.removeAll(listaProdutos);
            }
            if(aux == true){
                System.out.println("Forma de pagamento inviável!");
            }
        }
       
    }

    public List<ProdutoAbstrato> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<ProdutoAbstrato> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
