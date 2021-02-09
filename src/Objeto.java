public class Objeto implements ObjetoINT{

    private boolean incendiado;
    private String nombre;




///////////////////////////////Contructor
    public Objeto(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }

    public boolean isIncendiado() {
        return incendiado;
    }




    /*
    La primera letra del nombre del objeto debe de ser mayuscula
     */

    public void setNombre(String nombre) {

        if (Character.isUpperCase(nombre.charAt(0))){

            this.nombre = nombre;

        }

    }





    @Override
    public boolean prenderFuego() {

        boolean accionRealizada = true;

        if (this.incendiado){
            accionRealizada = false;
        }else{
            incendiado = true;
        }

        return accionRealizada;
    }

    @Override
    public boolean apagarFuego() {

        boolean accionRealizada = true;

     if (this.incendiado){
         incendiado = false;
     }else{
         accionRealizada = false;
     }

     return accionRealizada;

    }






}
