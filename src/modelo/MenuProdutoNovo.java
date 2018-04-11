package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuProdutoNovo {
	static Integer valorMenu = 0;
	static Scanner entrada = new Scanner(System.in);
	static List<Produto> produtos = new ArrayList<Produto>();
			
	public static void main(String[] args) {
		while (valorMenu != 3) {
			if (valorMenu == 1) {
				informarValores();
				chamarMenu();
			} else if (valorMenu == 2) {
				imprimir();
				chamarMenu();
			} else if (valorMenu == 3) {
				System.exit(0);
			} else {
				chamarMenu();
			}
		}
	}

	private static void imprimir() {
		for (Produto produto : produtos) {
			System.out.println(produto);
		}
		
	}

	private static void informarValores() {
		System.out.println("\nInforma o nome do Produto");
		String name = entrada.next();
		System.out.println("Quantidade de Produto");
		Integer quant = entrada.nextInt();
		System.out.println("Valor do Produto");
		Float valor = entrada.nextFloat();
		
		Produto novoProduto = new Produto(name, quant, valor);
		produtos.add(novoProduto);
	}

	private static void chamarMenu() {
		System.out.println("\n#########################");
		System.out.println("MENU");
		System.out.println("1:CADASTRAR PRODUTO");
		System.out.println("2:IMPRIMIR");
		System.out.println("3:SAIR");
		
		valorMenu = entrada.nextInt();
	
	}
}

