
import java.util.Scanner;

public class Validaciones {

    private Scanner sc = new Scanner(System.in);


    public boolean positivo(){

        boolean positivo = false;
        char respuesta;

        respuesta = Character.toUpperCase(sc.next().charAt(0));

        while(respuesta !='S' &&  respuesta!= 'N'){

            System.out.println("Letra incorrecta pulsa S o N");
            respuesta = Character.toUpperCase(sc.next().charAt(0));
        }

        if (respuesta=='S'){

            positivo = true;

        }

        return positivo;
    }



    public int numeroEntre(int min, int max ){

        int respuesta = sc.nextInt();

        while (respuesta> max || respuesta <min){
            System.out.println("El numero debe de estar entre "+min +" y "+max);
            respuesta = sc.nextInt();
        }

        return respuesta;
    }



}
