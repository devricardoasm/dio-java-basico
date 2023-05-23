import java.util.Scanner;

public class Ex05Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int multiplicador = 0;
        int contador = 0;

        System.out.println("Digite o número desejado: ");
        numero = scan.nextInt();

        while(contador <=10) {
            System.out.println(numero +" vezes " +multiplicador +" = " + (numero*multiplicador));

            contador++;
            multiplicador++;
        }

        for (int i = 0; i <=10 ; i++) {
            System.out.println(numero + " vezes " + i + " = " + (numero*i) + " (com for)");


        }
    }

        
}
