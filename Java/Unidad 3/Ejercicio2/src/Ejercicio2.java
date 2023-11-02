public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Escribe la cantidad en euros para convertirlo en pesetas");
        String linea1 = System.console().readLine();
        int euros;
        euros = Integer.parseInt( linea1 );
        double res = euros*166.386;
        System.out.println("La cantidad de " + euros + " euros es de " + res + " pesetas");
    }
}
