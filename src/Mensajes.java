public class Mensajes {

    public void mostrarMenu(){

        System.out.println("Que desea hacer?");
        System.out.println(" 1) Mostrar el estado de la habitacion");
        System.out.println(" 2) Añadir objeto");
        System.out.println(" 3) Incendiar objeto");
        System.out.println(" 4) Apagar objeto");

    }

    public void mostrarEstado(Habitacion habitacion){

        if (habitacion.timbreEncendido()){

            System.out.println("La alarma de incendios esta encendida");

        }else  {

            System.out.println("Todo esta perfectamente");

        }

    }





}
