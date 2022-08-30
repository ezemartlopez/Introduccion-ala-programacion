public class Main {
  static int sumar(int x, int y, int z) {
    return x + y + z;
  }
  
  static double sumar(double x, double y, double z) {
    return x + y + z;
  }
  
  public static void main(String[] args) {
    int Num1 = sumar(1,2,4);
    
    double Num3 = sumar(1.34,34.4,17.4);
    
    System.out.println("int: " + Num1);
    
    System.out.println("double: " + Num3);
  }
}