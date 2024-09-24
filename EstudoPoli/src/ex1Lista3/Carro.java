package ex1Lista3;

public class Carro extends Veiculo {
	private int qtdePortas;
	
	public Carro() {
		super();
	}
	
	public Carro(String marca, String modelo, int anoFabricacao, int anoModelo, float preco, int qtdePortas) {
		super(marca, modelo, anoFabricacao, anoModelo, preco);
		this.qtdePortas=qtdePortas;
	}
	
	public int getQtdePortas() {
		return qtdePortas;
	}
	
	public void setQtdePortas(int qtdePortas) {
		this.qtdePortas=qtdePortas;
	}
	
	
}
