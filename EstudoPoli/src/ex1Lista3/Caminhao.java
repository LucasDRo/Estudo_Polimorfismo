package ex1Lista3;

public class Caminhao extends Veiculo{
	private float capacidadeCarga;
	
	public Caminhao() {
		super();
	}
	
	public Caminhao(String marca, String modelo, int anoFabricacao, int anoModelo, float preco, float capacidadeCarga) {
		super(marca, modelo, anoFabricacao, anoFabricacao, preco);
		this.capacidadeCarga=capacidadeCarga;
	}
	
	public float getCapacidadeCarga() {
		return capacidadeCarga;
	}
	
	public void setCapacidadeCarga(float capacidadeCarga) {
		this.capacidadeCarga=capacidadeCarga;
	}
}
