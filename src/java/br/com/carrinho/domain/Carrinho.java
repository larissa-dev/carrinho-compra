package br.com.carrinho.domain;

import java.io.Serializable;
import java.util.Objects;

public class Carrinho implements Serializable {
    
    private Integer id;
    private Produto produto;
    private Integer qtdeProduto;

    public Carrinho() {
    }

    public Carrinho(Integer id, Produto produto, Integer qtdeProduto) {
        this.id = id;
        this.produto = produto;
        this.qtdeProduto = qtdeProduto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQtdeProduto() {
        return qtdeProduto;
    }

    public void setQtdeProduto(Integer qtdeProduto) {
        this.qtdeProduto = qtdeProduto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Carrinho other = (Carrinho) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Carrinho{" + "id=" + id + ", produto=" + produto + ", qtdeProduto=" + qtdeProduto + '}';
    }
    
    
    
}