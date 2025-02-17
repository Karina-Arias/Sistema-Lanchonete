package lanchonete;

public abstract class Prato {
	private double preco;
	private String dataValidade;
	private double peso;
	
	public Prato() {
		
	}
	
	public Prato (double preco, String dataValidade, double peso){
		this.preco = preco;
		this.dataValidade = dataValidade;
		this.peso = peso;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getDataValidade() {
		return dataValidade;
	}
	
	public void setDataValidade(String dataValidade){
		this.dataValidade = dataValidade;
	}
	
	public double getPeso(){
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public abstract double calcularPreco();

    @Override
    public abstract String toString();
	
}