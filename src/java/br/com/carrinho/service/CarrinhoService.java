package br.com.carrinho.service;

import br.com.carrinho.dao.CarrinhoDao;
import br.com.carrinho.domain.Carrinho;
import java.util.List;

public class CarrinhoService {
    private CarrinhoDao carrinhoDao = new CarrinhoDao();
    
    public Double fechar(){
        return carrinhoDao.fechar();
    }
    
    public List<Carrinho> listar(){
        return carrinhoDao.listar();
    }

    public boolean inserir(Carrinho carrinho){
        return carrinhoDao.inserir(carrinho);
    }

    public boolean excluir(Carrinho carrinho){
        return carrinhoDao.excluir(carrinho);
    }
}
