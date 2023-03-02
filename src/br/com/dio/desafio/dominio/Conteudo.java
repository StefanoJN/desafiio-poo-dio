package br.com.dio.desafio.dominio;

//Classe Abstrata
public abstract class Conteudo {

    //Atributo Protegido e imutável
    protected static final double XP_PADRAO = 10d;
    private String títuto;
    private String descricao;

    public String getTítuto() {
        return títuto;
    }

    public void setTítuto(String títuto) {
        this.títuto = títuto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();
}
