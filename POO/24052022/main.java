public class main {
    public static void main(String[] args) {

        RoboLunar robo = new RoboLunar();
        
        System.out.println(robo);

        System.out.println(robo.moverParaFrente(10));

        System.out.println(robo.virarRobo(90));

        System.out.println(robo.moverParaTras(10));

        System.out.println(robo.capturarFoto());
        
        System.out.println(robo);
        
    }

}
