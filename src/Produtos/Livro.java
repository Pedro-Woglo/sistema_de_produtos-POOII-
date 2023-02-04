package Produtos;

import Enums.EnumCategoria;
import Interfaces.ProdutoAcoes;


public class Livro extends ProdutoAbstrato implements ProdutoAcoes {

    private String editora;
    private String autorSobrenome;

    public Livro(String nome, Double preco, String marca, EnumCategoria categoria, String editora, String autorSobrenome) {
        super(nome, preco, marca, categoria);
        this.editora = editora;
        this.autorSobrenome = autorSobrenome;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAutorSobrenome() {
        return autorSobrenome;
    }

    public void setAutorSobrenome(String autorSobrenome) {
        this.autorSobrenome = autorSobrenome;
    }


    @Override
    public void novaDoacao() {
        System.out.println("Fazer doação");
    }

    @Override
    public void fazerPromocao() {
        System.out.println("Promoção para liquidação da Editora Tal");
    }

    @Override
    public String toString() {
        return "Livro{" +
                " Nome= " +getNome() +
                ", Preço=" + getPreco()+
                ", Marca= "+ getMarca()+
                ", Categoria= "+ getCategoria()+
                ", Editora= " + getEditora() + '\'' +
                ", Sobrenome do Autor= " + getAutorSobrenome() + '\'' +
                '}';
    }

    @Override
    public int compareTo(ProdutoAbstrato o) {
        return this.getNome().compareTo(o.getNome());
    }
}