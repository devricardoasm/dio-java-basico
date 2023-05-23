
import java.util.Scanner;

public class Ex01NomeEIdade {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        while(true) {
            System.out.println("Nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;   //Se nome digitado = 0, para a repetição

            System.out.println("Idade: ");
            idade = scan.nextInt();
        }
        System.out.println("Zero foi digitado em nome, repetição parou.");
    }
}
    

