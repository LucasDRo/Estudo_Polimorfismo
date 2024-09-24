package ex1Lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Veiculo> veiculos = new ArrayList<>();
		
		FicharioVeiculo fv = new FicharioVeiculo(veiculos);
		
		int op;
		
		do {
			
			System.out.println("--===< CONTROLE DE VEÍCULOS >===--");
			System.out.println("1 - CADASTRO");
			System.out.println("2 - EXCLUSÃO");
			System.out.println("3 - ALTERAÇÃO");
			System.out.println("4 - CONSULTA");
			System.out.println("5 - RELATÓRIO");
			System.out.println("6 - SAIR");
			System.out.println("Digite uma opção:");
			op=sc.nextInt();
			
			switch(op) {
			case 1:
				fv.cadastro();
				break;
			case 2:
				fv.exclusao();
				break;
			case 3:
				fv.alteracao();
				break;
			case 4:
				fv.consulta();
				break;
			case 5:
				fv.relatorio();
				break;
			case 6:
				System.out.println("Obrigado!");
				break;
				default:
					System.out.println("Digite um opção válida!");
					break;
			}
		}while(op!=6);
		
	}

}
