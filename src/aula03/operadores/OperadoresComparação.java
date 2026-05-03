package aula03.operadores;

public class OperadoresComparação {
    /*
    == - Igual a
    != - Diferente de
    > - Maior que
    < - Menor que
    >= - Maior ou igual a
    <= - Menor ou igual a

   !! Os operadores de comparação sempre retornam um valor do tipo: boolean
  por quê?
  porque eles estão respondendo uma pergunta lógica, tipo:
  * isso é igual?
  *isso é diferente?

  a pergunta só têm dois resultados possíveis:
  true (verdadeiro)
  false(falso)
     */

    public static void main(String[] args){
        boolean dezMaiorQueVinte = 10 > 20;
        boolean dezMenorQueVinte = 10 < 20;
        System.out.println(dezMaiorQueVinte);
        System.out.println(dezMenorQueVinte);
        System.out.println(5 == 5);
        System.out.println(5 != 5);
    }
}
