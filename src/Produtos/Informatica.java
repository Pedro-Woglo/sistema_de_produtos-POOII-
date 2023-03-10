package Produtos;

import Enums.EnumCategoria;

public class Informatica extends ProdutoAbstrato{

    private String software;
    private Double memoria;

    public Informatica(String nome, Double preco, String marca, EnumCategoria categoria, String software, Double memoria) {
        super(nome, preco, marca, categoria);
        this.software = software;
        this.memoria = memoria;
    }


    public String getSoftware() {
        return software;
    }

    public void setSoftware(String software) {
        this.software = software;
    }

    public Double getMemoria() {
        return memoria;
    }

    public void setMemoria(Double memoria) {
        this.memoria = memoria;
    }

    @Override
    public void novaDoacao() {
        System.out.println("Doação a sebos parceiros");
    }

    @Override
    public void fazerPromocao() {
        System.out.println("Promoção para estudantes");

    }

    @Override
    public String toString() {
        return "Informatica{" +
                " Nome= " +getNome() +
                ", Preço=" + getPreco()+
                ", Marca= "+ getMarca()+
                ", Software='" + getSoftware() + '\'' +
                ", Memória=" + getMemoria() +
                '}';
    }

    @Override
    public int compareTo(ProdutoAbstrato o) {
        return this.getNome().compareTo(o.getNome());
    }
}
