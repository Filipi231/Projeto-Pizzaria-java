package Pizzaria;

public abstract class Item {
	
	 String nome;
	    double preco;

	    public Item(String nome, double preco) {
	        this.nome = nome;
	        this.preco = preco;
	    }

	    public abstract void exibirDetalhes();
	}

	

	// Classe para representar pizzas
	class Pizza extends Item {
	    String tamanho;

	    public Pizza(String nome, double preco, String tamanho) {
	        super(nome, preco);
	        this.tamanho = tamanho;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("Pizza: " + nome + " Tamanho: " + tamanho + " Preço: R$" + preco);
	    }
	}