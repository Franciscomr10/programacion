public class Ejercicio16 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(System.console().readLine());
        int divisores = 0;
        int i = 1;
        while (i<num) {
            if (num%i==0) {
                divisores++;
            }
            i++;
        }
        if (divisores == 1) {
            System.out.println("Tu número es primo");
        } else {
            System.out.println("Tu número no es primo");
        }
    }
}
