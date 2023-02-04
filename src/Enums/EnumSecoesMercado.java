package Enums;

public enum EnumSecoesMercado {
    HIGIENE("Limpeza e higiene", 1),
    FRIOS("Congelados e carnes", 2),
    GRAOS("Grãos e perecíveis", 3),
    BEBIDAS("Bebidas e vinhos", 4),
    HORTIFRUTI("Verduras e Frutas", 5);

    private int id;
    private String descricao;

    EnumSecoesMercado(String descricao, int id) {
        this.descricao = descricao;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static EnumSecoesMercado escolhaSecaoMercado(int id) {
        for (EnumSecoesMercado idEscolhido : EnumSecoesMercado.values()) {
            if (idEscolhido.getId() == id) {
                return idEscolhido;
            }
        }
        throw new IllegalArgumentException("Opção inválida");
    }

    @Override
    public String toString() {
        return getId() + ", " + getDescricao();
    }
}