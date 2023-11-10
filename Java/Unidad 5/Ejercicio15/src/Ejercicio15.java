public class Ejercicio15 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce una base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un exponente: ");
        int exponente = Integer.parseInt(System.console().readLine());
        int i = 1;
        while (exponente+1>i) {
            System.out.println(base*i);
            i++;
        }
    }
}
