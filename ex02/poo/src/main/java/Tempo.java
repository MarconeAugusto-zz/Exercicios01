public class Tempo {

    private int hora;
    private int minuto;
    private int segundo;

    public Tempo (){}       //Construtor vazio

    public Tempo(int h){    //Construtor com hora
        hora = h;
    }

    public Tempo(int h , int m){
        hora = h;
        minuto = m;
    }

    public Tempo(int h, int m, int s){
        hora = h;
        minuto = m;
        segundo = s;
    }

    public String toString(){
        return (+hora+ ":" +minuto+ ":"+segundo);
    }

    public boolean setHora(int h) {
        if( h <= 23 || h > 0){
            hora = h;
            return true;
        }
        else {
            hora = 0;
            return false;
        }
    }

    public boolean setMinuto(int m){
        if( m <= 59 || m > 0){
            minuto = m;
            return true;
        }
        else{
            minuto = 0;
            return false;
        }
    }

    public boolean setSegundo(int s){
        if( s <= 59 || s > 0){
            segundo = s;
            return true;
        }
        else{
            segundo = 0;
            return false;
        }
    }

    public void setTempo(int h,int m,int s){
        setHora(h);
        setMinuto(m);
        setSegundo(s);
    }

    public long diferenca(Tempo x){
        return (tempoSegundos() - x.tempoSegundos());
    }

    public long tempoSegundos(){
        return  (hora*3600 + minuto*60 + segundo);
    }

}
