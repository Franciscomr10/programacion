public class Ejercicio32 {
    public static long voltear (long numero) {
        long voltear=0;
        while (numero>0) {
            voltear=(voltear*10)+(numero%10);
            numero /=10;
        }
    return voltear;
    }
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número entero positivo: ");
        long num = Long.parseLong(System.console().readLine());
        long pares = 0;
        long digito = 0;
        System.out.print("Dígitos pares: ");
        long voltear = voltear(num);
        while (voltear>0){
            digito=voltear%10;
            if (digito%2==0) {
                pares+=digito;
                System.out.print(digito + " ");
            }
            voltear/=10;
        }
        System.out.println("");
        System.out.println("La suma de los dígitos pares es de: " + pares);
    }
}
