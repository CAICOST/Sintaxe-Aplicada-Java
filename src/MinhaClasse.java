public class MinhaClasse {

    public static void main (String [] orgs) {

        String primeiroNome = "Caio";
        String segundoNome = "Costa";

        String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método "  +  primeiroNome.concat(" ").concat(segundoNome);

    }
}
