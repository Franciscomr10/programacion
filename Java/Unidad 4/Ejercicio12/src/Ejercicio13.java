public class Ejercicio13 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce 3 números enteros para ordenarlos");
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        int c = Integer.parseInt(System.console().readLine());
        if (a>b) {
            int aux = a;
            a = b;
            b = aux;
        }
        if (b>c) {
            int aux = b;
            b = c;
            c = aux;
        }
        if (a>b) {
            int aux = a;
            a = b;
            b = aux;
        }
        System.out.println("Los números ordenados serían: " + a + "->" + b + "->" + c);
    }
}
