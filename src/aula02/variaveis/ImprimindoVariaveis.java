package aula02.variaveis;

public class ImprimindoVariaveis {
    public static void main (String[] args){
        // Para valores que não mudam durante a execução podemos usar a palavra-chave 'Final'
        final int idadeMinima =  18;
        System.out.println("Proibido a entrada para menores de: "+idadeMinima);
    }
}
