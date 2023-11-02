public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
        System.out.println("Introduce el valor de a");
        String linea1 = System.console().readLine();
        double a = Integer.parseInt(linea1);
        System.out.println("Introduce el valor de b");
        String linea2 = System.console().readLine();
        double b = Integer.parseInt(linea2);
        if (a==0) {
            System.out.println("Esa ecuación no tiene solución real.");
        } else {
            double resultado = -b/a;
            System.out.println("x = " + resultado);
        }
    }
}
