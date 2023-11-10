public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce 10 números y te diré cuales son positivos y negativos");
        int i = 0;
        int num = 0;
        while (i!=11) {
            System.out.print("Introduce el número: ");
            num = Integer.parseInt(System.console().readLine());
            if (num<0) {
                System.out.println("Tu número es negativo");
            } else if (num>0) {
                System.out.println("Tu número es positivo");
            } else {
                System.out.println("El número que has introducido es 0 por lo que es nulo");
            }
            i++;
        }
    }
}
