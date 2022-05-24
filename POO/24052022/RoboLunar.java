public class RoboLunar {
    private int bateria = 30;
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

    @Override
    public String toString() {
        return  "Bateria = " + bateria +
                "% , Carregando? = " + isCarregando() ;

    }
}
