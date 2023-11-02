public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce el total de los ingresos");
        String linea1 = System.console().readLine();
        double total; 
        total = Integer.parseInt(linea1);
        System.out.println("Introduce la base imponible");
        String linea2 = System.console().readLine();
        double base;
        base = Integer.parseInt(linea2);
        double factura = total-base;
        System.out.println("El total de la factura con la base imponible es de " + factura + " euros");
    }
}
