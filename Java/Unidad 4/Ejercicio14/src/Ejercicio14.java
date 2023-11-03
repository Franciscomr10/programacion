public class Ejercicio14 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un número");
        int número = Integer.parseInt(System.console().readLine());
        if (número%2==0) {
            System.out.println("El número es par");
        } else if (número%2!=0) {
            System.out.println("El número es impar");
        }

        if (número%5==0) {
            System.out.println("El número es divisible entre 5");
        } else if (número%5!=0) {
            System.out.println("El número no es divisible entre 5");
        }
    }
}
