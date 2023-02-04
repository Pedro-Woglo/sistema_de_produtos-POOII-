package Produtos;

import Enums.EnumCategoria;
import Interfaces.InformaticaAcoes;
import Interfaces.ProdutoAcoes;

public class Informatica extends ProdutoAbstrato implements ProdutoAcoes, InformaticaAcoes {

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
    public String solicitacaoDeTecnicoEmDomicilio() {
        return "Agendamento do serviço pela central de telefone";
    }

    @Override
    public void indicacaoMemoria(double memoriaGigas) {
        if (memoriaGigas <= 8) {
            System.out.println("Indicado para usuários que usam pouco o computador, apenas para vídeos, jogos simples em flash e planilhas");
        } else if (memoriaGigas >= 32) {
            System.out.println("Inidcado para usuários que trabalham com renderização de imagens, edição de vídeos e design no geral");
        }
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
