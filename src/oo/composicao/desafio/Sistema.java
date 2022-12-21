package oo.composicao.desafio;

public class Sistema {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 9.67, 100);
        compra1.adicionarItem(new Produto("Notebook", 1897.88),2);

        Compra compra2 = new Compra();
        compra1.adicionarItem("Caderno", 10, 10);
        compra1.adicionarItem(new Produto("Impressora", 998.90),1);

        Cliente cliente = new Cliente("Maria Julia Morais");
        cliente.adicionaCompra(compra1);
        cliente.compras.add(compra2);

        System.out.println("Cliente: " + cliente.nome + " Valor total = " + cliente.obterValorTotal());
        System.out.println();
    }
}
