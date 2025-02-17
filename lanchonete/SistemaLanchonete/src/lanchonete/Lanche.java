package lanchonete;

public class Lanche extends Prato {

    private String pao;
    private String recheio;
    private String molho;

    public Lanche(double preco, String dataValidade, double peso, String pao, String recheio, String molho) {
        super(preco, dataValidade, peso);
        this.pao = pao;
        this.recheio = recheio;
        this.molho = molho;
    }

    public double calcularPreco() {
        double precoPao = 0.0;
        double precoRecheio = 0.0;
        double precoMolho = 0.0;

        if (pao.equals("Frances")) precoPao = 2.00;
        else if (pao.equals("Brioche")) precoPao = 2.50;
        else if (pao.equals("Integral")) precoPao = 3.00;

        if (recheio.equals("Carne")) precoRecheio = 5.00;
        else if (recheio.equals("Frango")) precoRecheio = 4.50;
        else if (recheio.equals("Vegetariano")) precoRecheio = 4.00;

        if (molho.equals("Ketchup")) precoMolho = 1.00;
        else if (molho.equals("Maionese")) precoMolho = 1.50;
        else if (molho.equals("Mostarda")) precoMolho = 1.20;

        return getPreco() + precoPao + precoRecheio + precoMolho;
    }

    @Override
    public String toString() {
        return "Lanche " + getRecheio();
    }

    public String getPao() {
        return pao;
    }

    public void setPao(String pao) {
        this.pao = pao;
    }

    public String getRecheio() {
        return recheio;
    }

    public void setRecheio(String recheio) {
        this.recheio = recheio;
    }

    public String getMolho() {
        return molho;
    }

    public void setMolho(String molho) {
        this.molho = molho;
    }
}
