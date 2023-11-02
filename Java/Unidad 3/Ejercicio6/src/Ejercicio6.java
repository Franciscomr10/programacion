public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce la base del triángulo en cm");
        String linea1 = System.console().readLine();
        int base;
        base = Integer.parseInt(linea1);
        System.out.println("Introduce la altura del triángulo en cm");
        String linea2 = System.console().readLine();
        int altura;
        altura = Integer.parseInt(linea2);
        double area = base*altura/2;
        System.out.println("El área del triángulo es " + area + " cm");
    }
}
