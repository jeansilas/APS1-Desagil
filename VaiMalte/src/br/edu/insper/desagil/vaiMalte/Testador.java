package br.edu.insper.desagil.vaiMalte;



public class Testador {

	public boolean testeA() {
	    Carrinho carrinho = new Carrinho();
	    Produto produto = new  Produto("Beer",42,10.0);
	    Caixa caixa = new Caixa();
	    double total = caixa.totalCarrinho(carrinho);
	    
	    if (total == 0.0) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	    
	    
	}

	public boolean testeB() {
	    Carrinho carrinho  = new Carrinho();
	    Produto produto = new Produto("Beer",42,10.0);
	    Caixa caixa = new Caixa();
	    carrinho.adiciona(produto);
	    double total= caixa.totalCarrinho(carrinho);
	    
	    if (total ==10.0) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}

	public boolean testeC() {
	    Carrinho carrinho = new Carrinho();
	    Produto produto = new Produto("Beer",42,10.0);
	    Caixa caixa = new Caixa();
	    carrinho.adiciona(produto);
	    caixa.descontaPorcentagem(produto, 10);
	    double total =  caixa.totalCarrinho(carrinho);
	    
	    if (total==9.0) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}

	public boolean testeD() {
	    Carrinho carrinho = new Carrinho();
	    Produto produto1 = new Produto("Beer",42,10.0);
	    Produto produto2 = new Produto("Wine",12,25.0);
	    Caixa caixa = new Caixa();
	    carrinho.adiciona(produto1);
	    carrinho.adiciona(produto2);
	    carrinho.adiciona(produto2);
	    caixa.descontaPorcentagem(produto1, 10);
	    double total = caixa.totalCarrinho(carrinho);
	     if (total==59.0) {
	    	 return true;
	     }
	     else {
	    	 return false;
	     }
	}

	public boolean testeE() {
		Carrinho carrinho = new Carrinho();
	    Produto produto1 = new Produto("Beer",42,10.0);
	    Produto produto2 = new Produto("Wine",12,25.0);
	    Caixa caixa = new Caixa();
	    carrinho.adiciona(produto1);
	    carrinho.adiciona(produto2);
	    carrinho.adiciona(produto2);
	    caixa.descontaPorcentagem(produto2, 25);
	    double total = caixa.totalCarrinho(carrinho);
	    
	    if (total == 47.5) {
	    	return true;
	    }
	    else {
	    	return false;
	    }
	}
}
