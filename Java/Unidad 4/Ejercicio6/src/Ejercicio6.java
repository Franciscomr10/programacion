public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca la altura de la que cae el objeto");
        String linea1 = System.console().readLine();
        double h = Integer.parseInt(linea1);
        double g = 9.81;
        if (h>0) {
            double tiempo = Math.sqrt(2*h/g);
            System.out.println("El tiempo que tardará en caer el objeto es de " + tiempo + " segundos");
        } else if (h<0) {
            System.out.println("La altura no puede ser negativa");
        }
    }
}
