public class Ejercicio25 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número entero: ");
        int num = Integer.parseInt(System.console().readLine());
        int volteado = 0;
        while (num>0){
            volteado = (volteado*10) + (num%10);
            num/=10;
        }
        System.out.println("El número del revés es: " + volteado);
    }
}
