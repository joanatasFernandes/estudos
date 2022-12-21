package exercicios.classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		/*Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;*/
		Produto caneta = new Produto("Caneta Preta", 10.98);
		Produto notebook = new Produto("Notebook", 1698.99);// forma de instaciar um objeto
		Produto tablete = new Produto("Tablet", 198.90);// nova inst�ncia de um objeto
			
		
		
		
		var p2 = new Produto();// outra forma de instaciar o objeto passando os valores para o atributo
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		Produto.desconto = 0.29;// acessando o desconto diretamente da classe, foi auterado o metodo para static.
		
		Produto produto = new Produto();
		produto.nome = "Tablet";
		produto.preco = 800.99;
		Produto.desconto = 0.50;
		
		System.out.println(caneta.nome + " " + caneta.precoComDesconto());
		System.out.println(notebook.nome + " " + notebook.precoComDesconto());
		System.out.println(tablete.nome + " " + tablete.precoComDesconto() );
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 =  caneta.precoComDesconto();
		double  precoFinal2 = p2.precoComDesconto(2);
		double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
		System.out.printf("Média do carrinho = R$%.2f", mediaCarrinho);
	}
}
