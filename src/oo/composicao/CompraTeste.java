package oo.composicao;

@SuppressWarnings("SpellCheckingInspection")
public class CompraTeste {
    public static void main(String[] args) {
        Compra compra = new Compra();
        compra.cliente = "João Pedro";
        compra.adicionarItem("Caneta",20, 7.45);
        compra.adicionarItem(new Item("Borracha",12, 3.89));
        compra.itens.add(new Item("Caderno",3, 18.79));
        compra.itens.add(new Item("Caderno",4, 19.79));

        System.out.println(compra.itens.size());
        System.out.println(compra.getValorTotal());

        // Mostrando a relação bidirecional,
        double total = compra.itens.get(0).compra.itens.get(1)
                .compra.getValorTotal();
        System.out.println("o total é " + total);
    }
}
