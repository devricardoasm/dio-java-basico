import java.util.Scanner;

public class Ex06Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println(("Fatorial: "));
        int fatorial = scan.nextInt();
        int multiplicacao = 1; //começar com 1, para não multiplicar por zero.

        for (int i = fatorial ; i >=1 ; i--) { //Exemplo: 5x4x3x2x1 = 120
            multiplicacao  = multiplicacao *i;

        }
        System.out.println(fatorial + "! = " +multiplicacao);
    }    
}
