public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número: ");
        Double num = Double.valueOf(System.console().readLine());
        System.out.printf("%-10s   %-10s   %-10s\n", "Número", "cuadrado", "cubo");
        System.out.println("-------------------------------");
        double i = num+6;
        num++;
        do {
            Double cuadrado = Math.pow(num, 2);
            Double cubo = Math.pow(num, 3);
            System.out.printf("%6.0f    %11.0f    %5.0f\n", num, cuadrado, cubo);
            num++;
        } while (num<i);
    }
}
