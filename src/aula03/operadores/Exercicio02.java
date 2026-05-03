package aula03.operadores;

public class Exercicio02 {
    public static void main ( String[] args ){
        double pesoPessoa1 = 85.5 ;
        double pesoPessoa2 = 90.0 ;
        double pesoPessoa3 = 92.0 ;
        double limiteCarga = 250.0 ;

        double pesoTotal = pesoPessoa1 + pesoPessoa2 + pesoPessoa3;
        boolean elevadorPodeSubir = (pesoTotal <=limiteCarga);

        System.out.println(pesoTotal);
        System.out.println("O elevador pode subir?" + elevadorPodeSubir);

    }
}
