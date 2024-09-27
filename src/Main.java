import br.com.dio.desafio.dominio.*;

import java.io.File;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Conteudo algoritmo = new Curso();
        algoritmo.setTitulo("Algoritmo");
        algoritmo.setDescricao("Algoritmo e portugol");
        algoritmo.setCargaHoraria(12);
        
        Conteudo estruturaDeDados = new Curso();
        estruturaDeDados.setTitulo("Estrutura de dados");
        estruturaDeDados.setDescricao("estrutura básico do sistema operacional");
        estruturaDeDados.setCargaHoraria(10);

        Conteudo basicoJava = new Curso();
        basicoJava.setTitulo("java básico");
        basicoJava.setDescricao("fundamentos essenciais de java para a programação");
        basicoJava.setCargaHoraria(20);
        
        Conteudo intermediarioJava = new Curso();
        intermediarioJava.setTitulo("java intermediario");
        intermediarioJava.setDescricao("programação java intermediario de programação orientada a objetos a collections.");
        intermediarioJava.setCargaHoraria(40);
        
        Conteudo avancadoJava = new Curso();
        avancadoJava.setTitulo("java avançado");
        avancadoJava.setDescricao("programação java garbage collector, tratamento de exceptions e casting");
        avancadoJava.setCargaHoraria(50);

        Conteudo mentoriaJava = new Mentoria();
        mentoriaJava.setTitulo("mentoria de java");
        mentoriaJava.setDescricao("descrição mentoria java");
        mentoriaJava.setData(LocalDate.now());

        Conteudo workShopJava = new Workshop();
        workShopJava.setTitulo("WorkShop e RoadMap de Java");
        workShopJava.setDescricao("WorkShop de Java para exposição e o caminho do programador iniciante");
        workShopJava.setCargaHoraria(4);

        // -------------   ||  -------------  Java  -------------  ||  -------------  ||  -------------

        Conteudo basicoCSharp = new Curso();
        basicoCSharp.setTitulo("Csharp básico");
        basicoCSharp.setDescricao("fundamentos essenciais de linguagem de programação C#");
        basicoCSharp.setCargaHoraria(22);
        
        Conteudo intermediarioCSharp = new Curso();
        intermediarioCSharp.setTitulo("Csharp intermediario");
        intermediarioCSharp.setDescricao("programação Csharp intermediario de programação orientada a objetos a collections.");
        intermediarioCSharp.setCargaHoraria(34);
        
        Conteudo avancadoCSharp = new Curso();
        avancadoCSharp.setTitulo("Csharp avançado");
        avancadoCSharp.setDescricao("programação Csharp garbage collector, tratamento de exceptions e casting");
        avancadoCSharp.setCargaHoraria(48);
        
        Conteudo mentoriaCSharp = new Mentoria();
        mentoriaCSharp.setTitulo("mentoria em CSharp");
        mentoriaCSharp.setDescricao("descrição mentoria CSharp");
        mentoriaCSharp.setData(LocalDate.now());

        Conteudo workShopCSharp = new Workshop();
        workShopCSharp.setTitulo("WorkShop e RoadMap de CSharp");
        workShopCSharp.setDescricao("WorkShop de CSharp para exposição e o caminho do programador iniciante");
        workShopCSharp.setCargaHoraria(6);

        Conteudo workShopCSharpE = new Workshop();
        workShopCSharpE.setTitulo("Tecnologia com CSharp");
        workShopCSharpE.setDescricao("Tecnologia csharp e suas melhores formas de aplicação");
        workShopCSharpE.setCargaHoraria(9);
        
        // -------------    ||  -------------  CSharp  ------------- ||  -------------   ||  -------------
        
        Conteudo basicoPython = new Curso();
        basicoPython.setTitulo("Python básico");
        basicoPython.setDescricao("fundamentos essenciais de Python para a programação");
        basicoPython.setCargaHoraria(20);
        
        Conteudo intermediarioPython = new Curso();
        intermediarioPython.setTitulo("Python intermediario");
        intermediarioPython.setDescricao("programação Python intermediario de programação orientada a objetos a collections.");
        intermediarioPython.setCargaHoraria(40);
        
        Conteudo avancadoPython = new Curso();
        avancadoPython.setTitulo("Python avançado");
        avancadoPython.setDescricao("programação Python garbage collector, tratamento de exceptions e casting");
        avancadoPython.setCargaHoraria(50);
        
        Conteudo mentoriaPython = new Mentoria();
        mentoriaPython.setTitulo("mentoria em Python");
        mentoriaPython.setDescricao("descrição mentoria Python");
        mentoriaPython.setData(LocalDate.now());

        Workshop workShopPython = new Workshop();
        workShopPython.setTitulo("WorkShop e RoadMap de Python");
        workShopPython.setDescricao("WorkShop de Python para exposição e o caminho do programador iniciante");
        workShopPython.setCargaHoraria(6);

        Conteudo workShopPythonG = new Workshop();
        workShopPythonG.setTitulo("Python e funcionalidades espaciais");
        workShopPythonG.setDescricao("Tecnologia Python para aplicação em projetos e analises espaciais");
        workShopPythonG.setCargaHoraria(10);

        // -------------    ||  -------------  Python  ------------- ||  -------------   ||  -------------
        
        Conteudo basicoRubyOnRails = new Curso();
        basicoRubyOnRails.setTitulo("Ruby On Rails básico");
        basicoRubyOnRails.setDescricao("fundamentos essenciais de Ruby On Rails para a programação");
        basicoRubyOnRails.setCargaHoraria(20);
        
        Conteudo intermediarioRubyOnRails = new Curso();
        intermediarioRubyOnRails.setTitulo("Ruby On Rails intermediario");
        intermediarioRubyOnRails.setDescricao("programação Ruby On Rails intermediario de programação orientada a objetos a collections.");
        intermediarioRubyOnRails.setCargaHoraria(40);
        
        Conteudo avancadoRubyOnRails = new Curso();
        avancadoRubyOnRails.setTitulo("Ruby On Rails avançado");
        avancadoRubyOnRails.setDescricao("programação Ruby On Rails garbage collector, tratamento de exceptions e casting");
        avancadoRubyOnRails.setCargaHoraria(50);
        
        Conteudo mentoriaRubyOnRails = new Mentoria();
        mentoriaRubyOnRails.setTitulo("mentoria em Ruby On Rails");
        mentoriaRubyOnRails.setDescricao("descrição mentoria Ruby On Rails");
        mentoriaRubyOnRails.setData(LocalDate.now());

        Conteudo workShopRubyOnRails = new Workshop();
        workShopRubyOnRails.setTitulo("WorkShop e RoadMap de Ruby On Rails");
        workShopRubyOnRails.setDescricao("WorkShop de Ruby On Rails para exposição e o caminho do programador iniciante");
        workShopRubyOnRails.setCargaHoraria(6);

        Conteudo workShopRubyOnRailsS = new Workshop();
        workShopRubyOnRailsS.setTitulo("Ruby On Rails e funcionalidades espaciais");
        workShopRubyOnRailsS.setDescricao("Tecnologia Ruby On Rails para aplicação em projetos e analises espaciais");
        workShopRubyOnRailsS.setCargaHoraria(10);

        // -------------    ||  -------------  Ruby on Rails  ------------- ||  -------------   ||  -------------

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("bootcampJava Java Developer");
        bootcampJava.setDescricao("Descrição bootcamp Java Developer");
        bootcampJava.getConteudos().add(algoritmo);
        bootcampJava.getConteudos().add(estruturaDeDados);
        bootcampJava.getConteudos().add(basicoJava);
        bootcampJava.getConteudos().add(intermediarioJava);
        bootcampJava.getConteudos().add(avancadoJava);
        bootcampJava.getConteudos().add(mentoriaJava);
        bootcampJava.getConteudos().add(workShopJava);

        Bootcamp bootcampCSharp = new Bootcamp();
        bootcampCSharp.setNome("bootcamp C Sharp Developer");
        bootcampCSharp.setDescricao("Descrição bootcamp C sharp Developer");
        bootcampCSharp.getConteudos().add(algoritmo);
        bootcampCSharp.getConteudos().add(estruturaDeDados);
        bootcampCSharp.getConteudos().add(basicoCSharp);
        bootcampCSharp.getConteudos().add(intermediarioCSharp);
        bootcampCSharp.getConteudos().add(avancadoCSharp);
        bootcampCSharp.getConteudos().add(mentoriaCSharp);
        bootcampCSharp.getConteudos().add(workShopCSharp);
        bootcampCSharp.getConteudos().add(workShopCSharpE);

        Bootcamp bootcampPython = new Bootcamp();
        bootcampPython.setNome("bootcampJava Python Developer");
        bootcampPython.setDescricao("Descrição bootcamp Python Developer");
        bootcampPython.getConteudos().add(algoritmo);
        bootcampPython.getConteudos().add(estruturaDeDados);
        bootcampPython.getConteudos().add(basicoPython);
        bootcampPython.getConteudos().add(intermediarioPython);
        bootcampPython.getConteudos().add(avancadoPython);
        bootcampPython.getConteudos().add(mentoriaPython);
        bootcampPython.getConteudos().add(workShopPython);
        bootcampPython.getConteudos().add(workShopPythonG);

        Bootcamp bootcampRubyOnRails = new Bootcamp();
        bootcampRubyOnRails.setNome("bootcampJava Python Developer");
        bootcampRubyOnRails.setDescricao("Descrição bootcamp Python Developer");
        bootcampRubyOnRails.getConteudos().add(algoritmo);
        bootcampRubyOnRails.getConteudos().add(estruturaDeDados);
        bootcampRubyOnRails.getConteudos().add(basicoRubyOnRails);
        bootcampRubyOnRails.getConteudos().add(intermediarioRubyOnRails);
        bootcampRubyOnRails.getConteudos().add(avancadoRubyOnRails);
        bootcampRubyOnRails.getConteudos().add(mentoriaRubyOnRails);
        bootcampRubyOnRails.getConteudos().add(workShopRubyOnRails);
        bootcampRubyOnRails.getConteudos().add(workShopRubyOnRailsS);
        bootcampRubyOnRails.getConteudos().add(workShopRubyOnRailsS);

        System.out.println(Bootcamp.imprimirConteudo(bootcampCSharp.getConteudos()));

        System.out.println(Bootcamp.imprimirConteudo(bootcampJava.getConteudos()));
        
        System.out.println(Bootcamp.imprimirConteudo(bootcampPython.getConteudos()));

        System.out.println(Bootcamp.imprimirConteudo(bootcampRubyOnRails.getConteudos()));

        File file = new File("C:/Users/dagobertodesousa/Documents/file.txt");

        System.out.println(file);
        
        /*Dev devCamila = new Dev();
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
        System.out.println(devCamila.getConteudosConcluidos());*/
    }
}
