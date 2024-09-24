package ex1Lista3;

import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;

public class FicharioVeiculo {
	Scanner sc = new Scanner(System.in);
	ArrayList<Veiculo> veiculos = new ArrayList<>();
	
	
	public FicharioVeiculo() {
		
	}
	
	public FicharioVeiculo(ArrayList<Veiculo> veiculos) {
		this.veiculos=veiculos;
	}
	
	public void cadastro() {
		
		int op;
		do {
			System.out.println("--==< CADASTRO DE VEICULOS >==--");
			System.out.println("1 - Carro");
			System.out.println("2 - Caminhão");
			System.out.println("3 - Voltar");
			System.out.println("Digite uma opção:");
			op=sc.nextInt();
			
			switch(op) {
			case 1:
				
				Carro car = new Carro();
				
				System.out.println("--< CADASTRO DE CARRO >--");
				System.out.println("Marca:");
				car.setMarca(sc.next());
				System.out.println("Modelo:");
				car.setModelo(sc.next());
				System.out.println("Ano de fabricação:");
				car.setAnoFabricacao(sc.nextInt());
				System.out.println("Ano do modelo:");
				car.setAnoModelo(sc.nextInt());
				System.out.println("Preço:");
				car.setPreco(sc.nextFloat());
				System.out.println("Quantidade de portas:");
				car.setQtdePortas(sc.nextInt());
				
				veiculos.add(car);
				
				break;
			case 2:
				
				Caminhao cam = new Caminhao();
				
				System.out.println("--< CADASTRO DE CAMINHÃO >--");
				System.out.println("Marca:");
				cam.setMarca(sc.next());
				System.out.println("Modelo:");
				cam.setModelo(sc.next());
				System.out.println("Ano de fabricação:");
				cam.setAnoFabricacao(sc.nextInt());
				System.out.println("Ano do modelo:");
				cam.setAnoModelo(sc.nextInt());
				System.out.println("Preço:");
				cam.setPreco(sc.nextFloat());
				System.out.println("Capacidade de Carga (KG):");
				cam.setCapacidadeCarga(sc.nextFloat());
				
				veiculos.add(cam);
				
				break;
			case 3:
				break;
			default:
				System.out.println("Digite uma opção válida!");
				break;
			}
		}while(op!=3);
		
	}
	
	public void exclusao() {
		
		if(!veiculos.isEmpty()) {
			int resp;
			int pos;
			int op;
			do {
				System.out.println("--==< EXCLUSÃO DE VEICULOS >==--");
				System.out.println("1 - Carro");
				System.out.println("2 - Caminhão");
				System.out.println("3 - Voltar");
				System.out.println("Digite uma opção:");
				op=sc.nextInt();
				
				switch(op) {
				case 1:
					
					System.out.println("Digite uma posição:");
					pos=sc.nextInt();
					
					if((pos>=0)&&(pos<veiculos.size())) {
						if(veiculos.get(pos) instanceof Carro) {
							
							imprimir(veiculos.get(pos));
							
							do {
								System.out.println("Confirma a exclusão? (1 - SIM / 2 - NÂO)");
								resp=sc.nextInt();
								switch(resp) {
								case 1:
									veiculos.remove(pos);
									System.out.println("Exclusão efetuada com sucesso!");
									break;
								case 2:
									System.out.println("Operação cancelada!");
									break;
								default:
									System.out.println("Digite um opção válida!");
									break;
								}
							}while((resp<1)||(resp>2));	
							
						}else
							System.out.println("Não há um carro armazenado nesta posição!");
						
					}else
						System.out.println("Pocisão inválida ou vazia!");
				
					break;
				case 2:
				
					System.out.println("Digite uma posição:");
					pos=sc.nextInt();
					
					if((pos>=0)&&(pos<veiculos.size())) {
						if(veiculos.get(pos) instanceof Caminhao) {
							
							imprimir(veiculos.get(pos));
						
							do {
								System.out.println("Confirma a exclusão? (1 - SIM / 2 - NÂO)");
								resp=sc.nextInt();
								switch(resp) {
								case 1:
									veiculos.remove(pos);
									System.out.println("Exclusão efetuada com sucesso!");
									break;
								case 2:
									System.out.println("Operação cancelada!");
									break;
								default:
									System.out.println("Digite um opção válida!");
									break;
								}
							}while((resp<1)||(resp>2));	
						
						}else
							System.out.println("Não há um caminhão armazenado nesta posição!");
					
					}else
						System.out.println("Pocisão inválida ou vazia!!");
				
				
					break;
				case 3:
					break;
				default:
					System.out.println("Digite uma opção válida!");
					break;
				}
			}while(op!=3);
		}else
			System.out.println("Nenhum veículo cadastrado!");
	}
	
	public void alteracao() {
		if(!veiculos.isEmpty()) {
			int resp;
			int pos;
			int op;
			do {
				System.out.println("--==< ALTERAÇÃO DE VEICULOS >==--");
				System.out.println("1 - Carro");
				System.out.println("2 - Caminhão");
				System.out.println("3 - Voltar");
				System.out.println("Digite uma opção:");
				op=sc.nextInt();
				
				switch(op) {
				case 1:
					
					System.out.println("Digite uma posição:");
					pos=sc.nextInt();
					
					if((pos>=0)&&(pos<veiculos.size())) {
						if(veiculos.get(pos) instanceof Carro) {
							
							imprimir(veiculos.get(pos));
							
							do {
								System.out.println("Confirma a alteração? (1 - SIM / 2 - NÂO)");
								resp=sc.nextInt();
								switch(resp) {
								case 1:
									Carro c = (Carro) veiculos.get(pos);
									System.out.println("Marca:");
									c.setMarca(sc.next());
									System.out.println("Modelo:");
									c.setModelo(sc.next());
									System.out.println("Ano de fabricação:");
									c.setAnoFabricacao(sc.nextInt());
									System.out.println("Ano do modelo:");
									c.setAnoModelo(sc.nextInt());
									System.out.println("Preço:");
									c.setPreco(sc.nextFloat());
									System.out.println("Quantidade de portas:");
									c.setQtdePortas(sc.nextInt());
									System.out.println("Alteração efetuada com sucesso!");
									break;
								case 2:
									System.out.println("Operação cancelada!");
									break;
								default:
									System.out.println("Digite um opção válida!");
									break;
								}
							}while((resp<1)||(resp>2));	
							
						}else
							System.out.println("Não há um carro armazenado nesta posição!");
						
					}else
						System.out.println("Pocisão inválida ou vazia!");
				
					break;
				case 2:
				
					System.out.println("Digite uma posição:");
					pos=sc.nextInt();
					
					if((pos>=0)&&(pos<veiculos.size())) {
						if(veiculos.get(pos) instanceof Caminhao) {
							
							imprimir(veiculos.get(pos));
						
							do {
								System.out.println("Confirma a alteração? (1 - SIM / 2 - NÂO)");
								resp=sc.nextInt();
								switch(resp) {
								case 1:
									Caminhao c = (Caminhao) veiculos.get(pos);
									System.out.println("Marca:");
									c.setMarca(sc.next());
									System.out.println("Modelo:");
									c.setModelo(sc.next());
									System.out.println("Ano de fabricação:");
									c.setAnoFabricacao(sc.nextInt());
									System.out.println("Ano do modelo:");
									c.setAnoModelo(sc.nextInt());
									System.out.println("Preço:");
									c.setPreco(sc.nextFloat());
									System.out.println("Quantidade de portas:");
									c.setCapacidadeCarga(sc.nextFloat());
									System.out.println("Alteração efetuada com sucesso!");
									
									break;
								case 2:
									System.out.println("Operação cancelada!");
									break;
								default:
									System.out.println("Digite um opção válida!");
									break;
								}
							}while((resp<1)||(resp>2));	
						
						}else
							System.out.println("Não há um caminhão armazenado nesta posição!");
					
					}else
						System.out.println("Pocisão inválida ou vazia!!");
				
				
					break;
				case 3:
					break;
				default:
					System.out.println("Digite uma opção válida!");
					break;
				}
			}while(op!=3);
		}else
			System.out.println("Nenhum veículo cadastrado!");
	}
	
	public void consulta() {
		
		if(!veiculos.isEmpty()) {
			int pos;
			
			System.out.println("--==< CONSULTA DE VEICULOS >==--");
			System.out.println("Digite uma posição:");
			pos=sc.nextInt();
					
			if((pos>=0)&&(pos<veiculos.size())) {
				imprimir(veiculos.get(pos));
			}else
				System.out.println("Posição inválida ou vazia!");
		
		}else
			System.out.println("Nenhum veículo cadastrado!");
	}
	
	public void relatorio() {
		
		if(!veiculos.isEmpty()) {
			
			System.out.println("--==< RELATÓRIO DE VEICULOS >==--");
					
			Iterator<Veiculo> i = veiculos.iterator();
			
			while(i.hasNext()) {
				
				Veiculo vc = i.next();
				if(vc instanceof Carro) {
					System.out.println("--< Dados do Carro >--");
					System.out.println("Quantidade de Portas: "+((Carro)vc).getQtdePortas());
				}else {
					System.out.println("--< Dados do Caminhão >--");
					System.out.println("Capacidade de Carga (KG): "+((Caminhao)vc).getCapacidadeCarga());
				}
				System.out.println("Marca:"				+vc.getMarca());
				System.out.println("Modelo:"			+vc.getModelo());
				System.out.println("Ano de Fabricação:"	+vc.getAnoFabricacao());
				System.out.println("Ano do Modelo:"		+vc.getAnoModelo());
				System.out.println("Preço: "			+vc.getPreco());
			}
				
			
		
		}else
			System.out.println("Nenhum veículo cadastrado!");
	}
	
	public void imprimir(Veiculo vc) {
		if(vc instanceof Carro)
			System.out.println("--< Dados do Carro >--");
		else
			System.out.println("--< Dados do Caminhão >--");
		
		System.out.println("Marca:"				+vc.getMarca());
		System.out.println("Modelo:"			+vc.getModelo());
		System.out.println("Ano de Fabricação:"	+vc.getAnoFabricacao());
		System.out.println("Ano do Modelo:"		+vc.getAnoModelo());
		System.out.println("Preço: "			+vc.getPreco());
		
		if(vc instanceof Carro) 
			System.out.println("Quantidade de Portas: "+((Carro)vc).getQtdePortas());
		else
			System.out.println("Capacidade de Carga (KG): "+((Caminhao)vc).getCapacidadeCarga());
		
	}
}
