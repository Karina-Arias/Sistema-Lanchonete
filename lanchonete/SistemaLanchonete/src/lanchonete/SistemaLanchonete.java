package lanchonete;

import java.util.Scanner;

public class SistemaLanchonete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        Pedido pedido = new Pedido(nomeCliente);
        
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Escolha o tipo de prato:");
            System.out.println("1 - Pizza");
            System.out.println("2 - Salgadinho");
            System.out.println("3 - Lanche");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Data de validade da Pizza (dd/mm/aaaa): ");
                String validade = scanner.nextLine();
                System.out.print("Peso da Pizza (em g): ");
                double peso = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Escolha o molho (Tomate / Branco / Barbecue): ");
                String molho = scanner.nextLine();
                System.out.print("Escolha o recheio (Calabresa / Frango / Mussarela): ");
                String recheio = scanner.nextLine();
                System.out.print("Escolha a borda (Catupiry / Cheddar / Sem Borda): ");
                String borda = scanner.nextLine();

                Pizza pizza = new Pizza(0.0, validade, peso, molho, recheio, borda);
                pedido.adicionarItem(pizza);
            } 
            else if (opcao == 2) {
                System.out.print("Data de validade do Salgadinho (dd/mm/aaaa): ");
                String validade = scanner.nextLine();
                System.out.print("Peso do Salgadinho (em g): ");
                double peso = scanner.nextDouble();
                scanner.nextLine();
             
                System.out.print("Escolha a massa (Frito / Assado): ");
                String massa = scanner.nextLine();
                System.out.print("Escolha o recheio (Frango / Carne / Queijo): ");
                String recheio = scanner.nextLine();

                Salgadinho salgadinho = new Salgadinho(0.0, validade, peso, recheio, massa);
                pedido.adicionarItem(salgadinho);
            } 
            else if (opcao == 3) {
                System.out.print("Data de validade do Lanche (dd/mm/aaaa): ");
                String validade = scanner.nextLine();
                System.out.print("Peso do Lanche (em g): ");
                double peso = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Escolha o pão (Frances / Brioche / Integral): ");
                String pao = scanner.nextLine();
                System.out.print("Escolha o recheio (Carne / Frango / Vegetariano): ");
                String recheio = scanner.nextLine();
                System.out.print("Escolha o molho (Ketchup / Maionese / Mostarda): ");
                String molho = scanner.nextLine();

                Lanche lanche = new Lanche(0.0, validade, peso, pao, recheio, molho);
                pedido.adicionarItem(lanche);
            }

            System.out.print("Deseja adicionar mais pratos? (S/N): ");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }

        pedido.mostrarFatura();

        System.out.print("Valor recebido: R$ ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Valor inválido. Digite um número válido.");
            scanner.next();
        }
        double valorRecebido = scanner.nextDouble();
        scanner.nextLine();

        double totalPedido = pedido.calcularTotal();
        double troco = valorRecebido - totalPedido;

        if (troco < 0) {
            System.out.println("O valor recebido não é suficiente. O valor do pedido é R$ " + String.format("%.2f", totalPedido).replace('.', ','));
        } else {
            System.out.println("Troco: R$ " + String.format("%.2f", troco).replace('.', ','));
        }
        
        scanner.close();
    }
}               