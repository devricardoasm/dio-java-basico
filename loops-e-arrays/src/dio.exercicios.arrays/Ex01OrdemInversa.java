public class Ex01OrdemInversa{
    public static void main(String[] args) {
        int [] vetor = {0, -5, 15, 50, 8, 4};
        int contador = 0;
        
        System.out.println("Vetor: ");
        while(contador <= vetor.length -1 ){
            System.out.println(vetor[contador]);
            contador++;
        }

        System.out.println("Vetor em ordem inversa: ");
        for(int i = (vetor.length -1); i >= 0; i--){
            System.out.println(vetor[i] + " ");
        }
        
    }
}