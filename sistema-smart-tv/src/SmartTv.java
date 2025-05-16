public class SmartTv {
    boolean ligada = false;
    int volume = 100;
    int canal = 7;

    public boolean ligar(){
        return this.ligada = true;
    }

    public void aumentarVolume(){
         this.volume++;
    }

    public void diminuirVolume(){
         this.volume--;
    }
}
