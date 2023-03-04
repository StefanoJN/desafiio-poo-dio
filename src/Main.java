import br.com.dio.desafio.dominio.*;

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

        /*System.out.println(curso1);
        System.out.println(curso2);*/

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTítuto("mentoria java");
        mentoria1.setDescricao("descricao mentoria java");
        mentoria1.setData(LocalDate.now());

       /* System.out.println(mentoria1);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("Descrição Bootcamp Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devStefano = new Dev();
        devStefano.setNome("Stefano");
        devStefano.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devStefano.getConteudoInscritos());
        devStefano.progredir();
        System.out.println("Conteudos Inscritos: " + devStefano.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: " + devStefano.getConteudoConcluidos());
        System.out.println("XP : " + devStefano.calcularXP());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos: " + devCamila.getConteudoInscritos());
        System.out.println("Conteudos Concluidos: " + devCamila.getConteudoConcluidos());
        System.out.println("XP : " + devCamila.calcularXP());

    }
}