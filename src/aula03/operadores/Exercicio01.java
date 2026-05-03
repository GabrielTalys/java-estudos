package aula03.operadores;

public class Exercicio01 {
    public static void main(String[] args){
        double precoPassagem = 1200.0;
        int mesesAntecedencia = 3;
        boolean temCupomVip = false;

        boolean podeComprarComdesconto = precoPassagem < 1500 && (mesesAntecedencia >= 2 || temCupomVip == true);
        System.out.println("O cliente tem direito ao desconto? " + podeComprarComdesconto);

    }
}
