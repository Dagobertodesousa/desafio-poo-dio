package br.com.dio.desafio.dominio;

public class Especial extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * 8;
    }

    public Especial() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Conteudo Especial{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
