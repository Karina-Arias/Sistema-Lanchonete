package lanchonete;

public class Salgadinho extends Prato{
	private String recheio;
	private String massa;
	
	public Salgadinho(double preco, String dataValidade, double peso, String recheio, String massa) {
		super(preco, dataValidade, peso);
		this.recheio = recheio;
		this.massa = massa;
	}
	
	public double calcularPreco() {
        double precoRecheio = 0.0;
        double precoMassa = 0.0;

        if (recheio.equals("Frango")) precoRecheio = 4.00;
        else if (recheio.equals("Carne")) precoRecheio = 5.00;
        else if (recheio.equals("Queijo")) precoRecheio = 3.50;

        if (massa.equals("Frito")) precoMassa = 1.50;
        else if (massa.equals("Assado")) precoMassa = 2.00;

        return getPreco() + precoRecheio + precoMassa;
    }

    @Override
    public String toString() {
        return "Salgadinho " + getRecheio();
    }
	
	public String getRecheio() {
		return recheio;
	}
	
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public String getMassa() {
		return massa;
	}
	
	public void setMassa(String massa) {
		this.massa = massa;
	}	
}
