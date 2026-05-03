package aula04.controleFluxo;

public class exercicio02 {
    public static void main(String[] args) {
        /*
        Crie uma variavel salario e imprima seu imposto
        imposto:
        salario < 1000 5%
        salario >= 1000 && salario < 2000 10%
        salario >= 2000 && salario < 3999 15%
        salario >= 4000 20%
         */

        double salario = 7500;
        double desconto = 0;

        if (salario < 1000) {
            desconto += 0.05;
            double salarioComDesconto = salario - (salario * desconto);

            System.out.println("O desconto de seu sálario é: " + desconto * 100 + "%");
            System.out.println("O valor a receber é de :" + salarioComDesconto);
        } else if (salario < 2000) {
            desconto += 0.10;
            double salarioComDesconto = salario - (salario * desconto);

            System.out.println("O desconto de seu sálario é: " + desconto * 100 + "%");
            System.out.println("O valor a receber é de :" + salarioComDesconto);

        } else if (salario <= 3999) {
            desconto += 0.15;
            double salarioComDesconto = salario - (salario * desconto);

            System.out.println("O desconto de seu sálario é: " + desconto * 100 + "%");
            System.out.println("O valor a receber é de :" + salarioComDesconto);

        } else {
            desconto += 0.20;
            double salarioComDesconto = salario - (salario * desconto);

            System.out.println("O desconto de seu sálario é: " + desconto * 100 + "%");
            System.out.println("O valor a receber é de :" + salarioComDesconto);
        }
    }
}
