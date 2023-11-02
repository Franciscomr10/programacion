public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce 2 números");
        String linea1 = System.console().readLine();
        int num1;
        num1 = Integer.parseInt(linea1);
        String linea2 = System.console().readLine();
        int num2;
        num2 = Integer.parseInt(linea2);
        int suma = num1+num2;
        int resta =num1-num2;
        int multiplicacion = num1*num2;
        int division = num1/num2;
        System.out.println("La suma de los 2 números es " + suma);
        System.out.println("La resta de los 2 números es " + resta);
        System.out.println("La multiplicación de los 2 números es " + multiplicacion);
        System.out.println("La división de los 2 números es " + division);
    }
}
