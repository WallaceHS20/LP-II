package edu.fatec.lp2.exercicio2;

public class ItemCompra implements Calculavel{
    int quantidade;
    Produto produto;
    double desconto;

    public ItemCompra(int quantidade, Produto produto, double desconto) {
        this.quantidade = quantidade;
        this.produto = produto;
        this.desconto = desconto;
    }

    public ItemCompra() {

    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


    @Override
    public double calcularPreco() {
        ItemCompra itemCompra = new ItemCompra(quantidade,produto,desconto);
        double desc = 0;

        desc = produto.getPreco() * quantidade;
        desc = (desconto / desc) * 100;
        System.out.println("Valor Final: R$" + desc);
        return desc;
    }
}
