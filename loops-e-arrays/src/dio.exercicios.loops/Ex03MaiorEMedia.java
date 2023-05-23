import java.util.Scanner;

public class Ex03MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;
       

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;
            if(numero > maior)
            maior = numero;
            
            
            contador++;
        } while( contador < 5);

        System.out.println("O Maior número digitado foi: " +maior);
        System.out.println("A média dos números digitados é: "+(soma/5));
    }
}
