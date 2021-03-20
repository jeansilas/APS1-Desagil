package br.edu.insper.desagil.vaiMalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> lista;

	public Carrinho() {
		super();
		this.lista = new ArrayList<>();
	}

	public List<Pedido> getLista() {
		return lista;
	}
	
	public void adiciona(Produto produto) {
		boolean naoExiste = true;
		for (Pedido pedido: this.lista) {
			
			if (pedido.getProduto().getCodigo() == produto.getCodigo()) {
				pedido.incrementa();
				naoExiste = false;
				
			}
		}
		if (naoExiste) {
			
			Pedido pedido = new Pedido(produto);
			this.lista.add(pedido);
			
		}
	}
} 
