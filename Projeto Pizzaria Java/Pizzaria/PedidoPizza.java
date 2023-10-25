package Pizzaria;

import java.util.ArrayList;
import java.util.List;

import cores.util.Cores;

public class PedidoPizza implements Pedido {
    private List<Item> itens = new ArrayList<>();
    private String enderecoEntrega; // Variável para armazenar o endereço de entrega

    @Override
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.preco;
        }
        return total;
    }

    @Override
    public void exibirRecibo() {
        System.out.println("Recibo do Pedidos:");
        for (Item item : itens) {
            item.exibirDetalhes();
        }
        if (enderecoEntrega != null && !enderecoEntrega.isEmpty()) {
            System.out.println("Endereço de Entrega: " + enderecoEntrega);
        }
        System.out.println("Total: R$" + calcularTotal());
    }

   
    public void adicionarEnderecoEntrega(String endereco) {
        this.enderecoEntrega = endereco;
    }

	@Override
	public void exibirMenu() {
		
		
	}

	
	public void exibirRecibo(double totalPedido) {
		 System.out.println(Cores.TEXT_GREEN_BOLD + "------------------------------------------------------------------");
         System.out.println("                        RECIBO DE PEDIDOS                         ");	
         System.out.println("------------------------------------------------------------------\n" + Cores.TEXT_RESET);
       
		for (Item item : itens) {
			item.exibirDetalhes();
		}
		if (enderecoEntrega != null && !enderecoEntrega.isEmpty()) {
			System.out.println(Cores.TEXT_YELLOW_BOLD + "Endereço de Entrega: " + enderecoEntrega + "\n");
		}
		System.out.println("Total do Pedido + o Frete: R$ " + totalPedido + Cores.TEXT_RESET);
	}
}
