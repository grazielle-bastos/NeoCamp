package c.orientacaoObjetos.ex4InterfacesAbstracao;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    // Lista de Itens (aceita Livro, Revista e futuras subclasses)
    private List<Item> itens = new ArrayList<>();

    // Adiciona qualquer item que implemente a interface
    public void adicionarItem(Item item) {
        itens.add(item);
    }

    // Lista todos os itens (polimorfismo)
    public void listarItens() {
        System.out.println("\n--- Itens na Biblioteca ---");
        for (Item item : itens) {
            item.exibirDetalhes(); // Chama a implementação específica
            System.out.println("---------------------------");
        }
    }
}

