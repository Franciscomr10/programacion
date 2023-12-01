public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número: ");
        int numIntro = Integer.parseInt(System.console().readLine());
        int volteado = 0;
        int num = numIntro;
        while (num>0) {
            volteado=(volteado*10)+(num%10);
            num/=10;
        }
        int inicial = volteado%10;
        while (volteado>1) {
            num=(num*10)+(volteado%10);
            volteado/=10;
        }
        num=(num*10)+inicial;
        System.out.println("El número resultado es: " + num);
    }
}
