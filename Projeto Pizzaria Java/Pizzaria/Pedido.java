package Pizzaria;

public interface Pedido {
	
	void adicionarItem(Item item);
	double calcularTotal();
	void exibirRecibo();
	void exibirMenu();
	
	
	
}
