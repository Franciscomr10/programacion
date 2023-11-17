public class Ejercicio21_2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce todos los números que quieras pero cuando tenga un negativo dejaré de pedirte números");
        int num = 0;
        int impares = 0;
        int contador = 0;
        int parmax = 0;
        int suma = 0;
        System.out.print("Introduce un número: ");
        num = Integer.parseInt(System.console().readLine());
        while (num>=0) {
            contador++;
            if (num%2!=0) {
                impares++;
                suma = num + suma;
            } else if (parmax<num){
                parmax = num;
            }
            System.out.print("Introduce un número: ");
            num = Integer.parseInt(System.console().readLine());        
        }
        int media = suma/impares;
        System.out.println("Has introducido un total de " + contador + " números.");
        System.out.println("La media de los números impares es: " + media);
        System.out.println("El número par más grande introducido es: " + parmax);
    }
}