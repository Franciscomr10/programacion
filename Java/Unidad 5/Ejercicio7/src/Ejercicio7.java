public class Ejercicio7 {
    public static void main(String[] args) throws Exception {
        System.out.println("¿Cual es la combinación de la caja?");
        int intentos = 4;
        for (int i = 1; i<5; i++) {
            int clave = Integer.parseInt(System.console().readLine());
            if (clave == 2004) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                i = i+5;
            } else if (clave != 2004) {
                intentos--;
                System.out.println("Lo siento, esa no es la combinación. Te quedan " + intentos + " intentos");
            }
        }
    }
}
