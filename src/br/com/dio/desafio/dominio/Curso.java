package br.com.dio.desafio.dominio;

//Herança
public class Curso extends Conteudo{
   private int cargaHoraria;

    public Curso() {
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "títuto='" + getTítuto() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria + '\'' +
                ", XP=" + calcularXp() +
                '}';
    }

    //Sub Escrita
    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }
}
