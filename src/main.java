public class main {

    public static void main(String[] args) {

        Validaciones val = new Validaciones();
        Mensajes men = new Mensajes();
        Habitacion habitacion = new Habitacion();
        int numeroMenu;

        do {
            men.mostrarMenu();
            numeroMenu =val.numeroEntre(1,4);
            switch (numeroMenu){

                case 1 -> {men.mostrarEstado(habitacion);}
                case 2 ->{habitacion.meterObjeto();}
                case 3 -> {habitacion.incendiarObjeto();}
                case 4-> {habitacion.apagarObjeto();}
                default -> {
                    System.out.println("Ha petao");
                }
            }

            System.out.println("Desea seguir? S/N");
        }while(val.positivo());

    }

}
