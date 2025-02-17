package lanchonete;

import java.util.ArrayList;

public class Pedido {
	private String nomeCliente;
	private double taxaServico;
	private ArrayList<Prato> itensConsumidos;
	
	public Pedido(String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.taxaServico = 0.10;
		this.itensConsumidos = new ArrayList<>();
	}
	
	public void adicionarItem(Prato item) {
        itensConsumidos.add(item);
    }
	
	public double calcularTotal() {
        double total = 0.0;
        for (Prato item : itensConsumidos) {
            total += item.calcularPreco();
        }
        total += total * taxaServico; 
        return total;
    }
    
	public void mostrarFatura() {
        System.out.println("Fatura do Pedido - Cliente: " + nomeCliente);
        for (Prato item : itensConsumidos) {
            System.out.println("Item: " + item.toString() + " | Preço: R$ " + item.calcularPreco());
        }

        double valorServico = calcularTotal() - (calcularTotal() / 1.10);
        valorServico = Math.round(valorServico * 100.0) / 100.0;

        System.out.println("Taxa de Serviço (10%): R$ " + String.format("%.2f", valorServico).replace('.', ','));
        System.out.println("Total do Pedido: R$ " + String.format("%.2f", calcularTotal()).replace('.', ','));
    }
}	