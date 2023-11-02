public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Escribe la cantidad en pesetas para convertirlo en euros");
        String linea1 = System.console().readLine();
        int pesetas;
        pesetas = Integer.parseInt( linea1 );
        double res = pesetas/166.386;
        System.out.println("La cantidad de " + pesetas + " euros es de " + res + " euros");
    }
}
