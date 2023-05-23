import java.util.Scanner;

public class Ex04ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qtdeNumeros;
        int qtdePares = 0; 
        int qtdeImpares = 0;

        System.out.println("Quantidade de números: ");
        qtdeNumeros = scan.nextInt();

        int contador = 0;

        do{
            System.out.println("Número: ");
            int numero = scan.nextInt();

            if(numero % 2 ==0) qtdePares++; //se o resto for zero, soma na quantidade de pares
            else qtdeImpares++; //caso contrário, soma na qtde de ímpares.

            contador++;
        }
        while(contador < qtdeNumeros);

        System.out.println("Quantidade de números pares: " +qtdePares);
        System.out.println("Quantidade de números ímpares: " +qtdeImpares);
    }    
}
