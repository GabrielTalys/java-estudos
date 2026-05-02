package aula02.variaveis;

public class Exercicio {
    //--> Exercício <--//

    /*
     - Crie um algoritmo que possua variaveis para salvar os seguintes dados: Nome, Endereço e telefone de uma pessoa.
     - Imprima essas variaveis da seguinte forma:
     - "O <nome> domiciliado no endereço: <endereço> e telephone: <telephone> não possui nenhum tipo de pendência em seu nome.
     */

    public static void main(String[] args) {
        String nome = "João da Silva";
        String endereco = "Rua: Alvaro Gomes de Almeida, N305 - Cinelandia - MG";
        String telephoneFormato = "(21)99889-6722";

        System.out.println("O " + nome + " domiciliado no endereço: " + endereco + " e telephone:" + telephoneFormato + " nâo possui nenhum tipo de pendência em seu nome.");

    }

}
