package oo;
public class Main {
    public static void main(String[] args) throws Exception {
        Veiculo primeiroVeiculo = new Veiculo();

        primeiroVeiculo.setCor("Azul");
        primeiroVeiculo.setModelo("BMW Série 3");
        primeiroVeiculo.setCapacidadeTanque(30);

        System.out.println(primeiroVeiculo.getModelo());
        System.out.println(primeiroVeiculo.getCor());
        System.out.println(primeiroVeiculo.getCapacidadeTanque());
        System.out.println(primeiroVeiculo.calcularValorTanque(5.00));

        Veiculo segundoVeiculo = new Veiculo();

        segundoVeiculo.setCor("Preto");
        segundoVeiculo.setModelo("Tesla");
        segundoVeiculo.setCapacidadeTanque(50);

        System.out.println(segundoVeiculo.getModelo());
        System.out.println(segundoVeiculo.getCor());
        System.out.println(segundoVeiculo.getCapacidadeTanque());
        System.out.println(segundoVeiculo.calcularValorTanque(4.00));

        
    }
}
