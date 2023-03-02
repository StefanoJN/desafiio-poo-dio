import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTítuto("curso java");
        curso1.setDescricao("descrição java");
        curso1.setCargaHoraria(8);

        //Polimofismo
        Conteudo curso2 = new Curso();
        curso2.setTítuto("curso C#");
        curso2.setDescricao("descrição C#");

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTítuto("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);


    }
}