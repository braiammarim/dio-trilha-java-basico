package ExercitandoMetodos;
public class Usuario {

    public static void main(String[] args) {
        // Instanciando um objeto da classe SmartTv

    SmartTv smartTv = new SmartTv();
    smartTv.diminuirVolume();
    smartTv.diminuirVolume();


    System.out.println("TV Ligada? : " + smartTv.ligada);
    System.out.println("Canal Atual : " + smartTv.canal);
    System.out.println("Volume Atual : " +smartTv.volume);

    smartTv.ligar();
    System.out.println("TV Ligada? : " + smartTv.ligada);

    smartTv.mudarCanal(13);
    System.out.println("Canal Atual : " + smartTv.canal);
    

    }
}

