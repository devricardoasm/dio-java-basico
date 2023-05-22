public class Main {
    public static void main(String[] args) {
        
        //////////////////////////////////////////////////////
        System.out.println("----- EXERCICIO DE CALCULADORA -----");
        Calculadora.soma(3, 6);
        Calculadora.subtracao(9, 5);
        Calculadora.multiplicacao(4, 3);
        Calculadora.divisao(25, 5);
        System.out.println("  ");
        //////////////////////////////////////////////////////
        System.out.println("----- MENSAGEM DE BOM DIA/TARDE/NOITE -----");
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(21);
        System.out.println("  ");
        //////////////////////////////////////////////////////
        System.out.println("----- EMPRESTIMO BANCARIO -----");
        Emprestimo.calcularEmprestimo(1000, 2);
        Emprestimo.calcularEmprestimo(1000, 3);
        Emprestimo.calcularEmprestimo(1000, 5);
    }
}
