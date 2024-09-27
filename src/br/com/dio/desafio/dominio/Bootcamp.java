package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> devsInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();
    private Integer cargaHorariaTotal;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<Dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public String isPresentConteudo(Conteudo conteudo){
        if (getConteudos().stream().anyMatch(n -> n.equals(conteudo))){
            return "Conteudo " + conteudo.getTitulo() + " encontrado na lista.";
        }
        return "Conteudo não consta.";
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public static String imprimirConteudo(Set<Conteudo> listaConteudo){
        String conteudo = listaConteudo.stream()
            .map(n -> n.getTitulo().toUpperCase() + ":\n" + n.getDescricao() + "\n")
            .reduce("", (n1, n2) -> n1.concat(n2));
        return "Conteudo " + conteudo;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    public Integer calcularCargaHorariaTotal() {
        return getConteudos().stream()
                    .mapToInt(h -> h.getCargaHoraria())
                    .reduce(0, Integer::sum);
    }

    public Integer getCargaHorariaTotal() {
        return cargaHorariaTotal;
    }

    public void setCargaHorariaTotal() {
        this.cargaHorariaTotal = getCargaHorariaTotal();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(dataInicial, bootcamp.dataInicial) && Objects.equals(dataFinal, bootcamp.dataFinal) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devsInscritos, conteudos);
    }
}
