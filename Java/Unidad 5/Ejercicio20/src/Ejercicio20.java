public class Ejercicio20 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el carácter con el que quieras dibujar la pirámide: ");
        String caracter = System.console().readLine();
        int planta=1;
        int longitudDeLinea=1;
        int espacios = altura-1;
        while (planta<=altura) {
            for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
            }
            for (int i = 1; i <= longitudDeLinea; i++) {
            System.out.print(caracter);
            }
            System.out.println();
            planta++;
            espacios--;
            longitudDeLinea+= 2;
        }
    }
}
