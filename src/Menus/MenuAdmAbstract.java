package Menus;

import Enums.EnumCategoria;
import Enums.EnumSecoesMercado;
import Interfaces.MenuAdmAcoes;
import Produtos.Informatica;
import Produtos.Livro;
import Produtos.Mercado;
import Produtos.ProdutoAbstrato;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public abstract class MenuAdmAbstract implements MenuAdmAcoes {
    protected Scanner sc;
    protected  List<ProdutoAbstrato> listaProdutos = new ArrayList<>();
    private  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public MenuAdmAbstract(Scanner sc, List <ProdutoAbstrato> listaProdutos) {
        this.sc = sc;
        this.listaProdutos=listaProdutos;
    }

    @Override
    public void visualizarProdutos() {
        for (ProdutoAbstrato produtoNaLista : listaProdutos) {
            System.out.println(produtoNaLista);
        }
    }

    @Override
    public void cadastrarProdutos() {
        System.out.print("Digite o nome do produto: ");
        String nomeProduto = sc.next();
        System.out.print("Digite o preço do produto: ");
        Double precoProduto = sc.nextDouble();
        System.out.print("Digite a marca: ");
        String marcaProduto = sc.next();
        System.out.print("Qual a categoria do produto(Mercado(m)/Livro(l)/Informática(i)): ");
        char ch = sc.next().charAt(0);
        if (ch == 'm') {
            System.out.print("Qual a data de validade: ");
            Date dataValidade;
            try {
                dataValidade = sdf.parse(sc.next());
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            System.out.print("Qual a seção do mercado? \n");
            for (EnumSecoesMercado secoes : EnumSecoesMercado.values()) {
                System.out.println(secoes);
            }
            EnumSecoesMercado secaoEscolhida = EnumSecoesMercado.escolhaSecaoMercado(sc.nextInt());
            listaProdutos.add(new Mercado(nomeProduto, precoProduto, marcaProduto, EnumCategoria.MERCADO, dataValidade, secaoEscolhida));
            System.out.println("Produto adicionado");

        } else if (ch == 'l') {
            System.out.print("Digite a editora: ");
            String nomeEditora = sc.next();
            System.out.print("Digite o sobrenome do autor(a): ");
            String sobrenomeAutor = sc.next();
            listaProdutos.add(new Livro(nomeProduto, precoProduto, marcaProduto, EnumCategoria.LIVRO, nomeEditora, sobrenomeAutor));
            System.out.println("Produto adicionado");

        } else if (ch == 'i') {
            System.out.print("Digite o nome do Software: ");
            String nomeSoftware = sc.next();
            System.out.print("Digite o tamanho da memória RAM: ");
            Double tamanhoMemoria = sc.nextDouble();
            listaProdutos.add(new Informatica(nomeProduto, precoProduto, marcaProduto, EnumCategoria.INFORMATICA, nomeSoftware, tamanhoMemoria));
            System.out.println("Produto adicionado");
        }

    }

    @Override
    public void editarProdutos() {
        System.out.println("Digite o nome do produto que deseja editar: ");
        String nome = sc.next();
        boolean aux = true;
        for (ProdutoAbstrato cadaProduto : listaProdutos) {
            if (cadaProduto.getNome().equals(nome)) {
                aux = false;
                System.out.println("O que deseja editar?(Nome(n)/Preço(p)/Marca(m)/Categoria(c):");
                char edicaoProduto = sc.next().charAt(0);
                if (edicaoProduto == 'n') {
                    System.out.print("Digite o novo nome: ");
                    String novoNome = sc.next();
                    cadaProduto.setNome(novoNome);
                }
                if (edicaoProduto == 'p') {
                    System.out.print("Digite o novo preco: ");
                    Double novoPreco = sc.nextDouble();
                    cadaProduto.setPreco(novoPreco);
                }
                if (edicaoProduto == 'm') {
                    System.out.print("Digite a nova marca: ");
                    String novaMarca = sc.next();
                    cadaProduto.setMarca(novaMarca);
                }
                if (edicaoProduto == 'c') {
                    System.out.print("Digite a nova categoria: (Mercado(m)/Livro(l)/Informática(i))");
                    char ch = sc.next().charAt(0);
                    if (ch == 'm') {
                        cadaProduto.setCategoria(EnumCategoria.MERCADO);
                    } else if (ch == 'l') {
                        cadaProduto.setCategoria(EnumCategoria.LIVRO);
                    } else if (ch == 'i') {
                        cadaProduto.setCategoria(EnumCategoria.INFORMATICA);
                    }
                }
                System.out.println("Produto editado: " + cadaProduto);
                break;
            }
        }
        if (aux == true) {
            System.out.println("Produto não encontrado!");
        }
    }

    @Override
    public void removerProdutos() {
        System.out.println("Digite o nome do produto que deseja deletar: ");
        String nomeExcluido = sc.next();
        boolean aux1 = true;
        for (ProdutoAbstrato c : listaProdutos) {
            if (c.getNome().equals(nomeExcluido)) {
                aux1 = false;
                System.out.println(c);
                listaProdutos.remove(c);
                System.out.println("Produto deletado!");
                break;
            }
        }
        if (aux1 == true) {
            System.out.println("Produto não encontrado!");
        }
    }

    public List<ProdutoAbstrato> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<ProdutoAbstrato> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }
}
