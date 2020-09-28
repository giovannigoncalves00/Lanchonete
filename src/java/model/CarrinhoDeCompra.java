package model;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarrinhoDeCompra {

    private Integer idpedido;
    private String data;
    private double preco;
    private List<PedidoProduto> itens;
    
    public void addNovoItem (PedidoProduto item){
        if(this.getItens()==null){
            this.setItens(new ArrayList<PedidoProduto>());
        }
        this.getItens().add(item);
    }
    public void removerItem(PedidoProduto itemRemove){
        for(Iterator i = getItens().iterator();i.hasNext();){
            PedidoProduto item = (PedidoProduto) i.next();
            if(item.getProduto().getIdproduto() == itemRemove.getProduto().getIdproduto()){
            i.remove();
            
        }
        }
    }

    public Integer getIdpedido() {
        return idpedido;
    }

    public void setIdpedido(Integer idpedido) {
        this.idpedido = idpedido;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<PedidoProduto> getItens() {
        return itens;
    }

    public void setItens(List<PedidoProduto> itens) {
        this.itens = itens;
    }
    
            }
