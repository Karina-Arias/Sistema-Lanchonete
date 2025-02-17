package lanchonete;

public class Pizza extends Prato{
	private String molho;
	private String recheio;
	private String borda;
	
	public Pizza() {
		
	}
	
	public Pizza(double preco, String dataValidade, double peso, String molho, String recheio, String borda) {
		super(preco, dataValidade, peso);
		this.molho = molho;
		this.recheio = recheio;
		this.borda = borda;
	}
	
	public double calcularPreco() {
        double precoMolho = 0.0;
        double precoRecheio = 0.0;
        double precoBorda = 0.0;

        if (molho.equals("Tomate")) precoMolho = 2.00;
        else if (molho.equals("Branco")) precoMolho = 2.50;
        else if (molho.equals("Barbecue")) precoMolho = 3.00;

        if (recheio.equals("Calabresa")) precoRecheio = 25.00;
        else if (recheio.equals("Frango")) precoRecheio = 30.00;
        else if (recheio.equals("Mussarela")) precoRecheio = 35.00;

        if (borda.equals("Catupiry")) precoBorda = 3.50;
        else if (borda.equals("Cheddar")) precoBorda = 4.00;
        else if (borda.equals("Sem Borda")) precoBorda = 0.00;

        return getPreco() + precoMolho + precoRecheio + precoBorda;
    }
	
	@Override
    public String toString() {
        return "Pizza " + getRecheio();
    }
	
	public String getMolho(){
		return molho;
	}
	
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	public String getRecheio() {
		return recheio;
	}
	
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	public String getBorda() {
		return borda;
	}
	
	public void setBorda(String borda) {
		this.borda = borda;
	}
}
