package modelo;

import java.awt.List;
import java.util.ArrayList;

import javax.swing.JOptionPane;





public class MenuProduto {
private static ArrayList<Produto> estoque = new ArrayList<Produto>();
	public static void main(String[] args) {
		int menu;
		
		while(true) {
			menu = menu2();
				if(menu ==1) {
					Produto temp = inputValues();
					if(temp != null) estoque.add(temp);			
				}	
				else if(menu == 2) {
					print();
				}
				// caso a opcao seja 0, quebra o laço
				else if(menu == 0) break;
				else {
					// se opcao nao corresponder a nenhum das opcoes acima 
					// serah informado ao usuario que a opcao escolhida eh invalida
					JOptionPane.showMessageDialog(null, "Opção inválida!");
				}
		}
	}
	
	public static int menu() {
		String temp = JOptionPane.showInputDialog(
				"<html><style>"
						+ "h3{ margin-top: 2px; margin-bottom: 2px;}"
						+ "</style>"
						+ "<h1>MENU</h1>"
						+ "<h3>1 - Cadastrar Produto</h3>"
						+ "<h3>2 - Imprimir</h3>"
						+ "<h3>0 - Sair</h3></html>");
		// tenta capturar a opcao do usuario
		try {
		//	caso o usuario pressione cancelar, serah retornado '0'
			return Integer.parseInt((temp==null?"0":temp));
		}catch(Exception e) {
			// se houver algum erro na conversao da opcao,
			// a funcao retornarah '-1'
		return -1;
		}
	}	
		
	
	private static Produto inputValues() {
		// TODO Auto-generated method stub
		return null;
	}
	private static void print() {
		// TODO Auto-generated method stub
		
	}
	private static int menu2() {
		// TODO Auto-generated method stub
		return 0;
	}
}


