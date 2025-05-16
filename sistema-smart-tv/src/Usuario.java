public class Usuario {

    public static void main(String[] args) {

        SmartTv tv = new SmartTv();
        tv.ligada = false;
        tv.volume = 100;
        tv.canal = 7;

        tv.ligar();
        tv.aumentarVolume();

        System.out.println("Ligada: " + tv.ligada );
        System.out.println("Volume: " + tv.volume );
        System.out.println("Canal: " + tv.canal );

        System.out.println();

    }

}
