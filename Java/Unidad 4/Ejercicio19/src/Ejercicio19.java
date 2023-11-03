public class Ejercicio19 {
    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.println("Introduce un número entero positivo o negativo de como máximo 5 dígitos");
        n = Math.abs(Integer.parseInt(System.console().readLine()));
        if (n<10) {
            System.out.println("Este número tiene 1 dígito");
        } else if ((n>=10) && (n<100)) {
            System.out.println("Este número tiene 2 dígitos");
        } else if ((n>=100) && (n<1000)) {
            System.out.println("Este número tiene 3 dígitos");
        } else if ((n>=1000) && (n<10000)) {
            System.out.println("Este número tiene 4 dígitos");
        } else if (n>=10000) {
            System.out.println("Este número tiene 5 dígitos");
        }
    }
}
