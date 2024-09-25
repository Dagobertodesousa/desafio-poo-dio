import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso basicoJava = new Curso();
        basicoJava.setTitulo("java básico");
        basicoJava.setDescricao("fundamentos essenciais de java para a programação");
        basicoJava.setCargaHoraria(20);
        
        Curso intermediarioJava = new Curso();
        intermediarioJava.setTitulo("java intermediario");
        intermediarioJava.setDescricao("programação java intermediario de programação orientada a objetos a collections.");
        intermediarioJava.setCargaHoraria(40);
        
        Curso avancadoJava = new Curso();
        avancadoJava.setTitulo("java avançado");
        avancadoJava.setDescricao("programação java garbage collector, tratamento de exceptions e casting");
        avancadoJava.setCargaHoraria(50);

        Mentoria mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("mentoriaJava de java");
        mentoriaJava.setDescricao("descrição mentoriaJava java");
        mentoriaJava.setData(LocalDate.now());

        Workshop workShopJava = new Workshop();
        workShopJava.setTitulo("WorkShop e RoadMap de Java");
        workShopJava.setDescricao("WorkShop de Java para exposição e o caminho do programador iniciante");
        workShopJava.setCargaHoraria(4);

        // -------------    ||  -------------   ||  -------------   ||  -------------

        Curso basicoCSharp = new Curso();
        basicoCSharp.setTitulo("Csharp básico");
        basicoCSharp.setDescricao("fundamentos essenciais de linguagem de programação C#");
        basicoCSharp.setCargaHoraria(22);
        
        Curso intermediarioCSharp = new Curso();
        intermediarioCSharp.setTitulo("Csharp intermediario");
        intermediarioCSharp.setDescricao("programação Csharp intermediario de programação orientada a objetos a collections.");
        intermediarioCSharp.setCargaHoraria(34);
        
        Curso avancadoCSharp = new Curso();
        avancadoCSharp.setTitulo("Csharp avançado");
        avancadoCSharp.setDescricao("programação Csharp garbage collector, tratamento de exceptions e casting");
        avancadoCSharp.setCargaHoraria(48);
        
        Mentoria mentoriaCSharp = new Mentoria();
        mentoriaCSharp.setTitulo("mentoria em CSharp");
        mentoriaCSharp.setDescricao("descrição mentoriaJava CSharp");
        mentoriaCSharp.setData(LocalDate.now());

        Workshop workShopCSharp = new Workshop();
        workShopCSharp.setTitulo("WorkShop e RoadMap de CSharp");
        workShopCSharp.setDescricao("WorkShop de CSharp para exposição e o caminho do programador iniciante");
        workShopCSharp.setCargaHoraria(6);

        Workshop workShopCSharpE = new Workshop();
        workShopCSharpE.setTitulo("Tecnologia com CSharp");
        workShopCSharpE.setDescricao("Tecnologia csharp e suas melhores formas de aplicação");
        workShopCSharpE.setCargaHoraria(9);
        
        // -------------    ||  -------------   ||  -------------   ||  -------------
        
        Curso basicoPython = new Curso();
        basicoPython.setTitulo("Python básico");
        basicoPython.setDescricao("fundamentos essenciais de Python para a programação");
        basicoPython.setCargaHoraria(20);
        
        Curso intermediarioPython = new Curso();
        intermediarioPython.setTitulo("Python intermediario");
        intermediarioPython.setDescricao("programação Python intermediario de programação orientada a objetos a collections.");
        intermediarioPython.setCargaHoraria(40);
        
        Curso avancadoPython = new Curso();
        avancadoPython.setTitulo("java avançado");
        avancadoPython.setDescricao("programação Python garbage collector, tratamento de exceptions e casting");
        avancadoPython.setCargaHoraria(50);
        
        Mentoria mentoriaPython = new Mentoria();
        mentoriaPython.setTitulo("mentoria em Python");
        mentoriaPython.setDescricao("descrição mentoriaJava Python");
        mentoriaPython.setData(LocalDate.now());

        Workshop workShopPython = new Workshop();
        workShopPython.setTitulo("WorkShop e RoadMap de Python");
        workShopPython.setDescricao("WorkShop de Python para exposição e o caminho do programador iniciante");
        workShopPython.setCargaHoraria(6);

        Workshop workShopPythonG = new Workshop();
        workShopPythonG.setTitulo("Python e funcionalidades espaciais");
        workShopPythonG.setDescricao("Tecnologia Python para aplicação em projetos e analises espaciais");
        workShopPythonG.setCargaHoraria(10);

        System.out.println(basicoJava);
        System.out.println(basicoCSharp);
        System.out.println(mentoriaJava);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("bootcampJava Java Developer");
        bootcampJava.setDescricao("Descrição bootcamp Java Developer");
        bootcampJava.getConteudos().add(basicoJava);
        bootcampJava.getConteudos().add(intermediarioJava);
        bootcampJava.getConteudos().add(avancadoJava);
        bootcampJava.getConteudos().add(mentoriaJava);
        bootcampJava.getConteudos().add(workShopJava);

        Bootcamp bootcampCSharp = new Bootcamp();
        bootcampCSharp.setNome("bootcamp C Sharp Developer");
        bootcampCSharp.setDescricao("Descrição bootcamp C sharp Developer");
        bootcampCSharp.getConteudos().add(basicoCSharp);
        bootcampCSharp.getConteudos().add(intermediarioCSharp);
        bootcampCSharp.getConteudos().add(avancadoCSharp);
        bootcampCSharp.getConteudos().add(mentoriaCSharp);
        bootcampCSharp.getConteudos().add(workShopCSharp);
        bootcampCSharp.getConteudos().add(workShopCSharpE);

        Bootcamp bootcampPython = new Bootcamp();
        bootcampPython.setNome("bootcampJava Python Developer");
        bootcampPython.setDescricao("Descrição bootcamp Python Developer");
        bootcampPython.getConteudos().add(basicoPython);
        bootcampPython.getConteudos().add(intermediarioPython);
        bootcampPython.getConteudos().add(avancadoPython);
        bootcampPython.getConteudos().add(mentoriaPython);
        bootcampPython.getConteudos().add(workShopPython);
        bootcampPython.getConteudos().add(workShopPythonG);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

        System.out.println(devCamila.tipoConteudo("curso"));
        System.out.println(devCamila.getConteudosConcluidos());
    }
}
