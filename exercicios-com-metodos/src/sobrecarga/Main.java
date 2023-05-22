package sobrecarga;

public class Main {
    public static void main(String[] args) {
        System.out.println("----- EXERCICIO DE QUADRILATEROS -----");
        ////////////////////////////////////////////
        System.out.println("QUADRADO: ");       
        Quadrilatero.area(3);
        System.out.println(" ");

        ////////////////////////////////////////////
        System.out.println("RETANGULO: ");
        Quadrilatero.area(8d, 8d);
        System.out.println(" ");

        ////////////////////////////////////////////
        System.out.println("TRAPEZIO: ");
        Quadrilatero.area(6, 6, 6);
        System.out.println(" ");

        ////////////////////////////////////////////
        System.out.println("LOSANGO: ");
        Quadrilatero.area(5f,5f);
    }    
}
