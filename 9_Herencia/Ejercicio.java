public class Ejercicio {
    public static void main(String args[]) {
      Cliente fulano = new Cliente();
      Trabajador mengano = new Trabajador();
      fulano.setNombre("Fulano");
      fulano.setEdad(33);
      fulano.setTelefono("0800-777-2587");
      fulano.setCredito(1500.5);
      
      mengano.setNombre("Mengano");
      mengano.setEdad(35);
      mengano.setTelefono("0800-342-2365");
      mengano.setSalario(50000);

      System.out.println("Nombre: " + fulano.getNombre());
      System.out.println("Edad: " + fulano.getEdad());
      System.out.println("Telefono: " + fulano.getTelefono());
      System.out.println("Credito: " + fulano.getCredito());
      
      System.out.println("======================");
      
      System.out.println("Nombre: " + mengano.getNombre());
      System.out.println("Edad: " + mengano.getEdad());
      System.out.println("Telefono: " + mengano.getTelefono());
      System.out.println("Salario: " + mengano.getSalario());
    }
}
class Persona{
    private int edad;
    private String nombre;
    private String telefono;
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTelefono(){
        return telefono;
    }
}

class Cliente extends Persona{
    private double credito;
    public void setCredito(double credito){
        this.credito = credito;
    }
    public double getCredito(){
        return credito;
    }
}

class Trabajador extends Persona{
    private double salario;
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
}