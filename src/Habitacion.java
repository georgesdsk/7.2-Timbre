import java.util.ArrayList;
import java.util.Scanner;

public class Habitacion {


    private ArrayList <Objeto> objetos = new ArrayList();
    private Timbre timbre = new Timbre();
    private Validaciones valida = new Validaciones();
    private Scanner sc = new Scanner(System.in);


    public Habitacion() {

        Objeto mesa = new Objeto("Mesa");
        Objeto silla = new Objeto("Silla");
        Objeto sillon = new Objeto("Sillon");
        
        objetos.add(mesa);
        objetos.add(silla);
        objetos.add(sillon);

    }

    public void isEncendiada(){

        for ( Objeto objeto: objetos //Si hay algun objeto incendiado, que active la alarma
             ) {
            if (objeto.isIncendiado()){

                timbre.encenderTimbre();

            }
        }

    }

    public boolean timbreEncendido(){

        return timbre.isSonar();

    }

    /*
    Analisis: Mete un objeto en el arrayList de objetos.
     */

    public void meterObjeto(){

        System.out.println(" Escribe el nombre del objeto.");
        String nombre = sc.nextLine();

            objetos.add(new Objeto(nombre));

        System.out.println("el objeto " +nombre+ "se ha metido correctamente");
    }

    public void apagarTimbre(){

        timbre.apagarTimbre();

    }

    public void incendiarObjeto(){

        Objeto objeto = listarObjetos();

        objeto.prenderFuego();

    }

    public  void apagarObjeto(){

        Objeto objeto = listarObjetos();

        objeto.apagarFuego();

    }

    public Objeto listarObjetos(){


        Objeto objeto;
        int eleccion;

        isEncendiada();// Comporobar el estado de la habitacion.

        for (int i = 0; i < objetos.size(); i++) {

            System.out.println(i+") "+ objetos.get(i).getNombre());

            if (objetos.get(i).isIncendiado()){

                System.out.print(" esta incendiado\n");
            }
        }

        eleccion = valida.numeroEntre(0, objetos.size());

        objeto = objetos.get(eleccion);

        return objeto;
    }


}
