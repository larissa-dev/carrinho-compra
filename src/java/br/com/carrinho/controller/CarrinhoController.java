package br.com.carrinho.controller;


import br.com.carrinho.domain.Carrinho;
import br.com.carrinho.service.CarrinhoService;
import br.com.carrinho.util.UtilMensagens;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="carrinhoMB")
@SessionScoped
public class CarrinhoController implements Serializable{
    
    private Carrinho carrinho = new Carrinho();
    private List<Carrinho> itens;
    private CarrinhoService carrinhoService = new CarrinhoService();
    private Double total;
    
    public CarrinhoController(){
        listar();
    }
    
    public void listar(){
        itens = carrinhoService.listar();
    }
    
    public String novo(){
        carrinho = new Carrinho();
        return "new.xhtml?faces-redirect=true";
    }
    
    public String cancelar(){
        return "list.xhtml?faces-redirect=true";
    }
    
    public String adicionar(){
        if(carrinhoService.inserir(carrinho)){
            UtilMensagens.mensagemSucesso("Sucesso", "Produto adicionado com sucesso!");
            this.listar();
            return "list.xhtml?faces-redirect=true"; 
        }
        UtilMensagens.mensagemErro("Erro", "Ocorreu um erro ao adicionar o produto!");
        return null;
    }
    
    public String remover(Carrinho carrinho){
        if(carrinhoService.excluir(carrinho)){
            UtilMensagens.mensagemSucesso("Sucesso", "Produto removido com sucesso!");
            this.listar();
            return "list.xhtml?faces-redirect=true"; 
        }
        UtilMensagens.mensagemErro("Erro", "Ocorreu um erro ao remover o produto!");
        return null;
    }
    
    public String fechar(){
        total = carrinhoService.fechar();
        return "pagamento.xhtml?faces-redirect=true";
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public void setCarrinho(Carrinho carrinho) {
        this.carrinho = carrinho;
    }

    public List<Carrinho> getItens() {
        return itens;
    }

    public void setItens(List<Carrinho> itens) {
        this.itens = itens;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    
    
}
