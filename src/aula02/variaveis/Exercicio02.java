package aula02.variaveis;

public class Exercicio02 {
    /*
    -- > Exercíocio 02 <--

    - Crie um algoritmo que possua as variaveis nome, salario, sexo(M ou F), idade, estado civil
    - Imprima da seguinte forma:
    O trabalhador(a) <nome> do sexo: <sexo>, idade <idade>, estado civil <estado civil> e salario <salario> encontra-se empregado neste estabelecimento.
     */

    public static void main(String[] args) {
        String nome = "Jurema Silva";
        float salario = 2500.50f;
        char sexo = 'F';
        int idade = 29;
        String estadoCivil = "Casada";

        System.out.println("O trabalhador(a): " + nome + " do sexo: " + sexo + ", idade: " + idade + " estadado civil: " + estadoCivil + " e salario: " + salario + " encontra-se empregado neste estabelecimento.");
    }
}
