public class Timbre extends Objeto{


    private boolean sonar =false ;


    public Timbre() {
        super("Timbre");
    }

    /*
    Precondiciones: en la habitacion debe de haber  algun objeto incendiado
    Postcondiciones: La variable sonar se cambiara a true;
     */

    public void encenderTimbre(){

        this.sonar = true;

    }

    public boolean isSonar() {
        return sonar;
    }

    public void apagarTimbre(){

        this.sonar = false;

    }
}
