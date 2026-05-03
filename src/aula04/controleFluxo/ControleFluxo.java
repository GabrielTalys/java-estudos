package aula04.controleFluxo;

public class ControleFluxo {
    public static void main(String[] args) {
        int idade = 17;
        boolean temConvite = true; // || false;
        boolean estaAcompanhada = true; // || false
        String permissao = "";

        if (idade >= 18) {
            if (temConvite) {
                permissao = "Seja bem-vindo(a)";
            } else {
                permissao = "Negado: Sem convite";
            }
        } else {
            if (temConvite && estaAcompanhada) {
                permissao = "Seja bem vindo(a) mas não afaste-se de sua companhia.";
            } else if (!temConvite) {
                permissao = "Negado: Sem convite";
            } else {
                permissao = "Negado: menor de idade sem acompanhante";
            }
        }
        System.out.println(permissao);
    }
}
