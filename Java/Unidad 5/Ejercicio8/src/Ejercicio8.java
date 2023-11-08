public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce de que número quieres la tabla de multiplicar: ");
        int num = Integer.parseInt(System.console().readLine());
        for (int i=1; i<11; i++) {
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
}
