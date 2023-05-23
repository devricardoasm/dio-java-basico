package oo;

class Veiculo {
    String cor;
    String modelo;
    static int capacidadeTanque;
    double gasolina;

//                ----- Construtor -----                //
    Veiculo(String cor, String modelo, int capacidadeTanque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTanque = capacidadeTanque;

    }
    Veiculo () {
        
    }
    //                ----- GETs E SETs -----                //
    String getCor() {
        return cor;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    String getModelo() {
        return modelo;
    }

    void setModelo(String modelo) {
        this.modelo = modelo;
    }

     double getCapacidadeTanque() {
        return capacidadeTanque;
    }

     void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    double getGasolina(){
        return gasolina;
    }


//                 -----MÉTODOS -----                //
    static double calcularValorTanque (double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;

        
    }
    
}

