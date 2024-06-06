import java.time.LocalDate;

import BrComDesafioDioDominio.BootCamp;
import BrComDesafioDioDominio.Curso;
import BrComDesafioDioDominio.Dev;
import BrComDesafioDioDominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        // Criando cursos
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso de Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Descrição do curso de JavaScript");
        curso2.setCargaHoraria(4);

        // Criando mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição da mentoria de Java");
        mentoria.setData(LocalDate.now());

        // Criando BootCamp
        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("BootCamp Java Developer");
        bootCamp.setDescricao("Descrição do BootCamp Java Developer");
        bootCamp.getConteudos().add(curso1);
        bootCamp.getConteudos().add(curso2);
        bootCamp.getConteudos().add(mentoria);

        // Criando Dev Weverson
        Dev devWeverson = new Dev();
        devWeverson.setNome("Weverson");
        devWeverson.inscreverBootCamp(bootCamp);

        // Imprimindo conteúdos inscritos e progressos do Dev Weverson
        System.out.println("Conteúdos Inscritos Weverson: " + devWeverson.getConteudosInscritos());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        devWeverson.progredir();
        devWeverson.progredir();

        System.out.println("Conteúdos Inscritos Weverson: " + devWeverson.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Weverson: " + devWeverson.getConteudosConcluidos());
        System.out.println("XP Total Weverson: " + devWeverson.calcularTotalXp());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        // Criando Dev João
        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootCamp(bootCamp);

        // Imprimindo conteúdos inscritos e progressos do Dev João
        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Total João: " + devJoao.calcularTotalXp());
    }
}
