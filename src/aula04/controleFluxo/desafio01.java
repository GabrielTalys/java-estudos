package aula04.controleFluxo;

public class desafio01 {
    public static void main(String[] args) {
        double valorCompra = 1200;
        boolean clienteVip = true;
        int quantidadeItens = 12;
        double desconto = 0;

        if (valorCompra >= 1000) {
            desconto += 0.10;
        }
        if (clienteVip) {
            desconto += 0.05;
        }
        if (quantidadeItens > 10) {
            desconto += 0.05;
        }

        double valorTotal = valorCompra - (valorCompra * desconto);
        System.out.printf("Você teve um desconto de: %.2f%%%n", desconto * 100);
        System.out.println("O valor da sua compra ficou em: R$ " + valorTotal);
    }
}