public class Ejercicio34 {
    public static void main(String[] args) throws Exception {
        System.out.print("Por favor, introduce un número: ");
        long num1 = Long.parseLong(System.console().readLine());
        System.out.print("Introduzca otro número: ");
        long num2 = Long.parseLong(System.console().readLine());
        long digito = 0;
        int pares = 0;
        int impares = 0;
        long volteado1 = 0;
        long volteado2 = 0;
        while (num1>0) {
            volteado1=(volteado1*10) + (num1%10);
            num1/=10;
        }
        while (num2>0) {
            volteado2=(volteado2*10) + (num2%10);
            num2/=10;
        }
        while (volteado1>0) {
            digito=volteado1%10;
            if (digito%2==0) {
                pares+=digito;
                pares*=10;
            } else {
                impares+=digito;
                impares*=10;
            }
            volteado1/=10;
        }
        while (volteado2>0) {
            digito=volteado2%10;
            if (digito%2==0) {
                pares+=digito;
                pares*=10;
            } else {
                impares+=digito;
                impares*=10;
            }
            volteado2/=10;
        }
        impares/=10;
        pares/=10;
        System.out.println("El número formado por los números pares es " + pares);
        System.out.println("El número formado por los números impares es " + impares);
    }
}
