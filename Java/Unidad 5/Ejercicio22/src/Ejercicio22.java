public class Ejercicio22 {
    public static void main(String[] args) throws Exception {
        System.out.println("Voy a mostar todos los números primos entre 2 y 100");
        int contador = 0;
        for (int i=2; i<101; i++) {
            contador = 0;
            for (int x=1; x<i; x++) {
                if (i%x==0) {
                    contador++;
                }
            }
            if (contador==1) {
            System.out.println(i);
            }
        }
    }
}
