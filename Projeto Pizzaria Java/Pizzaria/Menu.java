package Pizzaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cores.util.*;


public class Menu {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        PedidoPizza pedido = new PedidoPizza();
        Catalogo catalogo = new Catalogo();
        String enderecoEntrega = "";
        double totalPedido = 0.0; 
        int opcao = 0;
        double frete = 10.0;
        boolean mostrarRecibo = false;
        
        
        		System.out.println(Cores.TEXT_YELLOW_BOLD + Cores.ANSI_BLACK_BACKGROUND  +	
        		                   "                                                                  ");
                System.out.println("                                                                  ");
                System.out.println("                               PIZZARIA                           ");
                System.out.println("                                                                  ");
                System.out.println("                          MOLHO SEM MISERIA                       ");
                System.out.println("                                                                  ");
                System.out.println("                                      -++-                        ");
                System.out.println("                                   :-+#####=                      ");
                System.out.println("                               .-+##*+=*####*                     ");
                System.out.println("                            .:-=*#####*-*####*-                   ");
                System.out.println("                         .:==---+###**-:-=####*                   ");
                System.out.println("                        +#####*---::::----*#####                  ");
                System.out.println("                    ::---*#####::::::-----=*####=                 ");
                System.out.println("                  ---:-=--===::--::+*##*---=#####-                ");
                System.out.println("               +####*::::::-:-::-:-#####*--=#####*:               ");
                System.out.println("            :--*####*--::-=*####+--=***=----*+=-=-:               ");
                System.out.println("           :==-===--------====+++=----------=-----.               ");
                System.out.println("        FUNCIONAMENTO: TERÇA A DOMINGO | DAS 18:00 Às 00:00       ");
                System.out.println("                                                                  " + Cores.TEXT_RESET);
                System.out.println(Cores.TEXT_GREEN_BOLD +
                		           "------------------------------------------------------------------");
                System.out.println("                         SEJA BEM VINDO!                          ");
                System.out.println("------------------------------------------------------------------" );
                System.out.println("                                                                  ");

        while (true) {
        	System.out.println(Cores.TEXT_GREEN_BOLD  +
        			           "------------------------------------------------------------------");
            System.out.println("                      O QUE GOSTARIA HOJE?:                       ");
            System.out.println("------------------------------------------------------------------\n");
            
            System.out.println(Cores.TEXT_YELLOW_BOLD + " [1]. Ver Catálogo de Pizzas");
            System.out.println(Cores.TEXT_YELLOW_BOLD + " [2]. Fazer Pedido");
            System.out.println(Cores.TEXT_YELLOW_BOLD + " [3]. Nota Fiscal");
            System.out.println(Cores.TEXT_YELLOW_BOLD +" [4]. Sair");
           
         try {   
            
            System.out.println(Cores.TEXT_CYAN_BOLD + "\n Digite o numero do item:" + Cores.TEXT_RESET );
            opcao = leia.nextInt();
            leia.nextLine(); 
            
         }catch (java.util.InputMismatchException e) {
        	 
        	 System.out.println(Cores.TEXT_RED + "Por favor, insira um numero inteiro." + Cores.TEXT_RESET);
        	 leia.nextLine(); 
        	 continue;
         }
            
            switch (opcao) {
               
            	case 1:
                	System.out.println(Cores.TEXT_GREEN_BOLD  + "------------------------------------------------------------------");
                    System.out.println("                         TODOS OS SABAORES:                       ");
                    System.out.println("------------------------------------------------------------------\n" + Cores.TEXT_RESET);
                    
                    List<Pizza> pizzasDisponiveis = catalogo.getCatalogo();
                    for (int i = 0; i < pizzasDisponiveis.size(); i++) {
                        Pizza pizza = pizzasDisponiveis.get(i);
                        System.out.println((i + 1) + ". " + pizza.nome + " - Tamanho: " + pizza.tamanho + " - Preço: R$" + pizza.preco);
                        System.out.println("");
                    }
                    break;

                case 2:
                    totalPedido = 0.0; 
                    List<Pizza> pizzas = catalogo.getCatalogo();
                    
                    System.out.println(Cores.TEXT_GREEN_BOLD + "------------------------------------------------------------------");
                    System.out.println("                        FAÇA SEU PEDIDO:                          ");	
                    System.out.println("------------------------------------------------------------------\n" + Cores.TEXT_RESET);
                  
                    while (true) {
                    	
                    	
                        System.out.println(Cores.TEXT_CYAN_BOLD + "Digite os números dos sabores desejados:\n" + Cores.TEXT_RESET); 
                        System.out.println(Cores.TEXT_GREEN_BOLD + "Digite 0 para finalizar pedido\n" + Cores.TEXT_RESET);
                        int numeroSabor = leia.nextInt();
                        leia.nextLine();
                      
                        if (numeroSabor == 0) {
                            break;
                        }

                        if (numeroSabor >= 1 && numeroSabor <= pizzas.size()) {
                            Pizza pizzaEscolhida = pizzas.get(numeroSabor - 1);
                            System.out.println(Cores.TEXT_YELLOW_BOLD + "\n------------------------------------------------------------------\n");
                            System.out.println( Cores.TEXT_YELLOW_BOLD + "Você escolheu o Sabor: " + pizzaEscolhida.nome + "\n");
                            System.out.println("Tamanho: " + pizzaEscolhida.tamanho + "\n");
                            System.out.println("Preço: R$" + pizzaEscolhida.preco + "\n");
                            System.out.println("Algo mais?\n");
                           
                            System.out.println("------------------------------------------------------------------\n");
                            totalPedido += pizzaEscolhida.preco;
                        } else {
                            System.out.println(Cores.TEXT_RED + "Sabor Inválido" + Cores.TEXT_RESET);
                        }
                    }
           
                    System.out.println(Cores.TEXT_GREEN_BOLD +"------------------------------------------------------------------" );
                    System.out.println("                             Entrega do Pedido:                   ");
                    System.out.println( "------------------------------------------------------------------\n" + Cores.TEXT_RESET);
                    
                    System.out.println(Cores.TEXT_YELLOW_BOLD + "Frete fixo de R$: 10,00\n");
                    System.out.println(Cores.TEXT_CYAN_BOLD + "Digite o endereço de entrega: \n" + Cores.TEXT_RESET);
                    enderecoEntrega = leia.nextLine();
                    pedido.adicionarEnderecoEntrega(enderecoEntrega);
                    
                    totalPedido += frete;
                    
                    System.out.println(Cores.TEXT_YELLOW_BOLD + "------------------------------------------------------------------");
                    System.out.println("\nJa vamos preparar seu Pedido! \n" + Cores.TEXT_RESET);
                    System.out.println(Cores.TEXT_CYAN_BOLD + "Digite 3 para acessar a nota fiscal\n" +  Cores.TEXT_RESET);
                    mostrarRecibo = true;
                    break;
                    
                    

                case 3:
                	if (mostrarRecibo) {
                		pedido.exibirRecibo(totalPedido);
                	}
                	
                	else {
                		System.out.println(Cores.TEXT_RED + "Pedido ainda nao realizado" + Cores.TEXT_RESET);
                	}
                	
                	System.exit(0);
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida.");
                    
                    
            } 
        }  
    }
}
