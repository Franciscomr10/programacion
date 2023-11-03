public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un número entero");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println("La última cifra del número entero es " + (n%10));
    }
}
