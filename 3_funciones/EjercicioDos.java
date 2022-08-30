  class Coche{
    int puertas=0;
  
    public Coche(int num_puertas) {
      puertas = num_puertas;
    }
    public void incrementarPuertas() {
      puertas++;
    }
  
    public void estadoPuertas() {
      System.out.println("Tengo "+puertas+" puertas en total");
    }  
}

class EjercicioDos{
	public static void main(String[] args) {

    Coche car = new Coche(4); // Creo la clase con 4 puertas
    car.estadoPuertas(); // veo el estado de puertas antes de la modificacion
    car.incrementarPuertas(); // llamo a su metodo
    car.estadoPuertas(); // veo el estado de puertas
  }
}