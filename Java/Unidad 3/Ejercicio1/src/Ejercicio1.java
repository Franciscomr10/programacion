public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Escribe 2 números que quieras multiplicar");
        String linea = System.console().readLine();
        int num1;
        num1 = Integer.parseInt( linea );
        String linea2 = System.console().readLine();
        int num2;
        num2 = Integer.parseInt( linea2 );
        int res = num2*num1;
        System.out.println("La multiplicación de " + num1 + " y " + num2 + " da como resultado " + res);
    }
}
