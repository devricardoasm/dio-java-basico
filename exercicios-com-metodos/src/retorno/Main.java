package retorno;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("----- EXERCICIO DE QUADRILATEROS -----");
        ////////////////////////////////////////////
        System.out.println("QUADRADO: ");       
        System.out.println("A área do quadrado vale: " +QuadrilateroComRetorno.area(3));
        System.out.println(" ");

        ////////////////////////////////////////////
        System.out.println("RETANGULO: ");
        System.out.println("A área do retangulo vale: " +QuadrilateroComRetorno.area(8d, 8d));
        System.out.println(" ");

        ////////////////////////////////////////////
        System.out.println("TRAPEZIO: ");
        System.out.println("A área do trapezio vale: " +QuadrilateroComRetorno.area(6, 6, 6));
        System.out.println(" ");

        ////////////////////////////////////////////
        System.out.println("LOSANGO: ");
        System.out.println("A área do losango vale: " +QuadrilateroComRetorno.area(5f,5f));
    }    
}
