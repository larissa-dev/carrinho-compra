package br.com.carrinho.service;

import br.com.carrinho.dao.ProdutoDao;
import br.com.carrinho.domain.Produto;
import java.util.List;


public class ProdutoService {
    private ProdutoDao produtoDao = new ProdutoDao();
    
    public List<Produto> listar(){
        return produtoDao.listar();
    }
    
    public Produto consultar(Integer id){
        return produtoDao.consultar(id);
    }
    
    public boolean inserir(Produto produto){
        return produtoDao.inserir(produto);
    }
    
    public boolean alterar(Produto produto){
        return produtoDao.alterar(produto);
    }
    
    public boolean excluir(Produto produto){
        return produtoDao.excluir(produto);
    }

}