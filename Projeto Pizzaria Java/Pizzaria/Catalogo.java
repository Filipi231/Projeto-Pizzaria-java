package Pizzaria;

import java.util.ArrayList;
import java.util.List;

import cores.util.Cores;

public class Catalogo {
    private List<Pizza> catalogo;

    public Catalogo() {
        catalogo = new ArrayList<>();
       
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Margherita", 30.9, "Média"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Margherita", 45.9, "Grande"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Calabresa", 30.9, "Média"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Calabresa", 40.9, "Grande"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Quatro Queijos", 40.0, "Média"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Quatro Queijos", 55.0, "Grande"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Frango C/ Catupiry", 34.0, "Média"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Frango C/ Catupiry", 43.9, "Grande"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Portuguesa", 30.9, "Média"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Portuguesa", 42.9, "Grande"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Pepperoni", 43.9, "Média"));
        catalogo.add(new Pizza(Cores.TEXT_YELLOW_BOLD +"Pepperoni", 54.9, "Grande"));
    }

    public List<Pizza> getCatalogo() {
        return catalogo;
    }   
}
