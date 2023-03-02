package br.com.dio.desafio.dominio;

import java.time.LocalDate;

//Herança
public class Mentoria extends Conteudo{
    private LocalDate data;

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "títuto='" + getTítuto() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }

    //Sub Escrita
    @Override
    public double calcularXp() {
        return XP_PADRAO + 10d;
    }
}
