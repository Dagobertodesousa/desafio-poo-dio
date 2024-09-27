package br.com.dio.desafio.dominio;

public class Workshop extends Conteudo{

    @Override
    public double calcularXp() {
        return XP_PADRAO * 2;
    }

    public Workshop() {
        //this.workShopCriado();
    }
    
    public void workShopCriado(){
        System.out.println("Novo WorkShop foi criado");
    }

    @Override
    public String toString() {
        return "Workshop{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                "}";
    }
}
