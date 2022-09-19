public class App {
    public static void main(String[] args) throws Exception {

        //Se declara variable para almacenar el resultado de la función.
        int restultado;
        //se ejecuta la funcón indicando el valor de los parametros a sumar y se obtiene el resultado.
        restultado = suma(4,5,7);
        //se muestra por pantalla el resultado de la operación realizada.
        System.out.println(restultado);

        //se declara el objeto Coche
        Coche miCoche = new Coche();
        //se indica el valor de puertas actuales que tiene el Coche.
        miCoche.ValorPuertasActual(2);
        //se muestra por pantalla el valor de puertas que tiene el coche.
        System.out.println("El número de puertas del coche es actualmente "+miCoche.puerta);
        System.out.println("Se va a incrementar una puerta al coche de forma automática");
        //se incrementa de formata automática en uno el valor de la puerta.
        miCoche.IncrementarPuertas();
        System.out.println("Ahora el coche tiene "+miCoche.puerta+" puertas");
        
    }

    //se declara la función para realizar la suma de los paramatres y devuelve el resultado obtenido.
    public static int suma (int a, int b, int c){
        return a+b+c;
    }

}


//se declara la Clase Coche con diferentes funciones y variables.
class Coche{

    //variable para almacenar el valor del número de puertas
    public int puerta=0;
    
    //se declara la función para establecer en caso necesario el valor de puertas que tiene el coche actualmente.
    public void ValorPuertasActual(int a){
        this.puerta=a;
    }

    //se declara la función para incremetar de uno en uno el valor de las puertas.
    public void IncrementarPuertas(){
        this.puerta++;
    }

    //se declara variable para devolver el varlor acutal del número de puertas.
    public int puerta(){
        return this.puerta;
    }
}
