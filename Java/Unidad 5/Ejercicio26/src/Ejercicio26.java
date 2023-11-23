public class Ejercicio26 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce un dígito: ");
        int digito = Integer.parseInt(System.console().readLine());
        System.out.print("El número: " + num + " tiene el dígito: " + digito + " en la posición: ");
        int volteado= 0;
        int longitud = 0;
        int posicion = 1;
        if (num==0) {
            longitud = 1;
        }
        while (num>0) {
            volteado = (volteado*10) + (num%10);
            num/=10;
            longitud++;
        }
        while (volteado>0) {
            if ((volteado%10)==digito) {
                System.out.print(posicion + " ");
            }
            volteado/=10;
            posicion++;
        }
    }
}
