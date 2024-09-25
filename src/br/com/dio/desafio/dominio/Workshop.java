package br.com.dio.desafio.dominio;

public class Workshop extends Conteudo{

    private int cargaHoraria;

    @Override
    public double calcularXp() {
        return XP_PADRAO * 2;
    }

    public Workshop() {
    }


    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
