    package model;

import java.util.Calendar;
import java.util.Date;

public class Pedido {
    int id_pedido;
    Date data;
    Double preco;
    int quantidade;
    Pagamento pagamento;
    Produto produto;

    public Pedido(){

    }
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public void calculaPreco(){
        /* Adicionar arraylist de produtos e multiplicar o preço pela quantidade??    */
    }



}
