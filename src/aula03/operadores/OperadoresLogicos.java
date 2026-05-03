package aula03.operadores;

public class OperadoresLogicos {

    /*
    && - Tudo precisa ser verdadeiro para true, caso não = false/ E
    || - Basta um ser verdadeiro/ OU
    ! Inverte o valor
     */

    public static void main( String[] args) {
        int idade = 18;
        float salario = 3000f;
        System.out.println(idade >= 18 || salario <= 2000);
        System.out.println(idade >= 18 && salario <= 2000);
        System.out.println( !(idade < 18) );
    }
}
