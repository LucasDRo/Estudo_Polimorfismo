package ex1Lista3;

public abstract class Veiculo {
	private String marca;
	private String modelo;
	private int anoFabricacao;
	private int anoModelo;
	private float preco;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String marca, String modelo, int anoFabricacao, int anoModelo, float preco) {
		this.marca=marca;
		this.modelo=modelo;
		this.anoFabricacao=anoFabricacao;
		this.anoModelo=anoModelo;
		this.preco=preco;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	public int getAnoModelo() {
		return anoModelo;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao=anoFabricacao;
	}
	
	public void setAnoModelo(int anoModelo) {
		this.anoModelo=anoModelo;
	}
	
	public void setPreco(float preco) {
		this.preco=preco;
	}
}
