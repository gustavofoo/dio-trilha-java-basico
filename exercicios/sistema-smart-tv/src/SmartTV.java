public class SmartTV {
    boolean ligada = false; 
    String canal = "Grobo";
    int volume = 25;

    
    public void ligar(){
        ligada = true;
        System.out.println("Ligando TV");
    }

    public void desligar(){
        ligada = false;
        System.out.println("Desligando TV");
    }

    public void mudarCanal(String novoCanal){
        canal = novoCanal;
        System.out.println("Alterando canal para: " + canal);
    }

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando volume para: " + volume);
    }
    
    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo volume para: " + volume);
    }
}
