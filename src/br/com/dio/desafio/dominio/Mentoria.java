package br.com.dio.desafio.dominio;


public class Mentoria extends Conteudo{

    public Mentoria() {
        //this.mentoriaCriado();
    }
    
    public void mentoriaCriado(){
        System.out.println("Novo Mentoria foi criada");
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + getData() +
                "}";
    }
}
