public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        int num1 = 1;
        int suma, num2 = 0;
        int i = 0;
        System.out.print("Introduce la cantidad de números de la sucesión de Fibonacci quieres ver: ");
        int n = Integer.parseInt(System.console().readLine());
        do {
            suma = num1+num2;
            num1 = num2;
            num2 = suma;
            System.out.print(suma + " ");
            i++;
        } while (i!=n);
    }   
}
