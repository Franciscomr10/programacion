public class Ejercicio28 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(System.console().readLine());
        int factorial = 1;
        for (int i = 2; i<=num; i++) {
            factorial = factorial*i;
        }
        System.out.println("El factorial del número " + num + "! = " + factorial);
    }
}