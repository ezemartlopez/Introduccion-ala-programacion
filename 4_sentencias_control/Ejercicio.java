public class Ejercicio {
  public static void main(String[] args) {
  	// IF ELSE
    int numeroIf = -2;
    if (numeroIf == 0) {
        System.out.println("el numero es cero");
    }
    else if(numeroIf > 0){
        System.out.println("el numero es positivo");
    }
    else {
        System.out.println("el numero es negativo");
    }
    System.out.println("===========================");
    // WHILE
    int numeroWhile = 0;
    while(numeroWhile < 3){
        System.out.println(numeroWhile);
        numeroWhile++;
    }
    System.out.println("===========================");
    // DO WHIlE
    do{
   	    System.out.println(numeroWhile);
        numeroWhile++;
    }while(numeroWhile < 3);

    System.out.println("===========================");

    // FOR 
    for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
        System.out.println(numeroFor);
	}
    System.out.println("===========================");
    // SWITCH
    String estacion = "primavera";
    switch(estacion) {
        case "verano":
        case "otoño":
        case "invierno":
        case "primavera":
  	        System.out.println("La estacion es: "+estacion);
            break;
        default:
            System.out.println("No es una estacion");
}
  }
}
