public class RoboLunar {
    public int bateria = 100;
    private String msg = "Carregando, nao é possível executar mais açoes";

    public String virarRobo(double graus) {
        if(isCarregando()){
            return msg;
        }else {
            this.bateria -= 5;
            return "Virando " + graus + " graus";
        }
    }

    public String moverParaFrente(int metros) {
        if(isCarregando()){
            return msg;
        }else {
            this.bateria -= 10;
            return "Movendo " + metros + " metros para frente";
        }
    }

    public String moverParaTras(int metros) {
        if(isCarregando()){
             return msg;
                
        }else {
            this.bateria -= 10;
            return "Movendo " + metros + " metros para trás";
        }
    }

    public String capturarFoto() {
        if(isCarregando()){
            return msg;
        }else {
            this.bateria -= 2;
            return "Capturando foto";
        }
    }

    public boolean isCarregando() {
        return this.bateria <= 10;
    }

    public void carregarBateria() throws InterruptedException {
            System.out.println("Carregando...");
            Thread.sleep(5000);
            this.bateria = 100;
            System.out.println("Bateria em 100% novamente!!");
    }

    @Override
    public String toString() {
        return  "Bateria = " + bateria +
                ", Carregando? = " + isCarregando() ;

    }
}
