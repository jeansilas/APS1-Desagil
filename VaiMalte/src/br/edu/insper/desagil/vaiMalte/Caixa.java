package br.edu.insper.desagil.vaiMalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map<Integer,Integer> desconto;

	public Caixa() {
		super();
		this.desconto = new HashMap<>();
	}
	
	public void descontaPorcentagem(Produto produto, int descontoPorcentagem) {
		int codigo = produto.getCodigo();
		if (descontoPorcentagem>0 && descontoPorcentagem<100) {
			this.desconto.put(codigo,descontoPorcentagem);
		}
	}
	
	public double totalCarrinho(Carrinho carrinho) {
		double total = 0 ;
		for(Pedido pedido: carrinho.getLista()) {
			Produto produto = pedido.getProduto();
			
			if (this.desconto.containsKey(produto.getCodigo())) {
				double des = 1-this.desconto.get(produto.getCodigo())*(0.01);
				total = total + pedido.total()*des;
			}
			else {
				total = total + pedido.total();
			}
		}
		return total;
	}
}
