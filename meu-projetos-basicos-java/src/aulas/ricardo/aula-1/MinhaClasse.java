package aula.ricardo.javabasico;

public class MinhaClasse {
   public static void main (String [] args) {
    String primeiroNome = "Ricardo";
    String segundoNome = "Augusto";

    String nomeCompleto = concatenarNome(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);

    
}
    public static String concatenarNome (String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
