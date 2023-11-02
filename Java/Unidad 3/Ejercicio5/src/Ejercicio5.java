public class Ejercicio5 {

  public static void main(String[] args) throws Exception {
    System.out.println("Introduce la altura del rectángulo en cm");
    String linea1 = System.console().readLine();
    int altura;
    altura = Integer.parseInt(linea1);
    System.out.println("introduce la base del ractángulo en cm");
    String linea2 = System.console().readLine();
    int base;
    base = Integer.parseInt(linea2);
    int area = base * altura;
    System.out.println("El área del rectángulo es " + area + " cm cuadrados");
  }
}
