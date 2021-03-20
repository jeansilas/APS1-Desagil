package br.edu.insper.desagil.vaiMalte;

public class Pedido {
	private Produto produto;
	private int quantidade ;
	
	public Pedido(Produto produto) {
		super();
		this.produto = produto;
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public void incrementa() {
		this.quantidade++ ;
		
	}
	
	public double total() {
		return this.produto.getPreco() *  this.quantidade; 
	}
}
