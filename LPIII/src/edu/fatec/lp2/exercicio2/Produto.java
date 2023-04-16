package edu.fatec.lp2.exercicio2;

public class Produto {
    private String nome;
    private String unidade;
    private String descricao;
    double preco;
    Supermercado supermercado;

    public Produto(String nome, String unidade, String descricao, double preco, Supermercado supermercado) {
        this.nome = nome;
        this.unidade = unidade;
        this.descricao = descricao;
        this.preco = preco;
        this.supermercado = supermercado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Supermercado getSupermercado() {
        return supermercado;
    }

    public void setSupermercado(Supermercado supermercado) {
        this.supermercado = supermercado;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", unidade='" + unidade + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", supermercado=" + supermercado +
                '}';
    }
}
