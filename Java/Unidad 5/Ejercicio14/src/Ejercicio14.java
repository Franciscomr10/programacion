public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce una base: ");
        double base = Double.parseDouble(System.console().readLine());
        System.out.print("Introduce un exponente entero positivo: ");
        double exponente = Double.parseDouble(System.console().readLine());
        while (exponente<0) {
            System.out.print("Has introducido un número negativo. Introduce un número entero positivo: ");
            exponente = Double.parseDouble(System.console().readLine());
        }
        Math.abs(exponente);
        double resultado = Math.pow(base, exponente);
        System.out.printf("El resultado es: %.0f", resultado);
    }
}
