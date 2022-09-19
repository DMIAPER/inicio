public class App {
    public static void main(String[] args) throws Exception {

        //Se declaran las variables que se van a comparar.
        int numeroIf= 0;
        //bucle if-else para comprobar si el valor es mayor, igual o menor que 0
        if(numeroIf>0){ 
            System.out.println("El número "+numeroIf+" es mayor a cero");
        }else if(numeroIf==0){ 
            System.out.println("El número "+numeroIf+" es igual a cero");
        }else{
            System.out.println("El número "+numeroIf+" es menor a cero");
        }
       
        //se declara la variable para el bucle while y do-while
        int numeroWhile=0;
        //bucle while para incrementar un número hasta llegar a un valor inferior a 3
        while(numeroWhile<3){
            System.out.println("El valor actual en el bucle While es " +numeroWhile);
            numeroWhile++;
        }

        //bucle do-while para incrementar un número
        do{
            System.out.println("El valor actual en el bucle do-while es " +numeroWhile);
            numeroWhile++;
        }while(numeroWhile<3);

        //se declara la variable para el bucle for
        int numeroFor =0;
        //bucle for para incrementar un número hasta llegar a un valor inferior o igual a 3
        for(int i=0;i<=3;i++){   
            numeroFor = numeroFor+1;
            System.out.println("El valor actual en en bucle FOR es " +numeroFor);
        }
                     

        //se declara la variable estación
        String estacion= "verano";

        //bule switch para mostrar estación del año
        switch(estacion){
            case "invierno":
                System.out.println("Ahora nos encontramos en la estación de Invierno");
                break;
            case "primavera":
                System.out.println("Ahora nos encontramos en la estación de Primaverea");
                break;
            case "verano":
                System.out.println("Ahora nos encontramos en la estación de Verano");
                break;
            case "otoño":
                System.out.println("Ahora nos encontramos en la estación de Otoño");
                break;
            default:
                System.out.println("No existe ninguna estación del año con ese nombre");
                break;
        
        }
    }

}
