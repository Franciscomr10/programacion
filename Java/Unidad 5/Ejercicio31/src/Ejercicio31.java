public class Ejercicio31 {
    public static void main(String[] args) throws Exception {
        System.out.print("Dime la altura de la L: ");
        int altura = Integer.parseInt(System.console().readLine());
        for (int i=1; i<altura;i++) {
        System.out.println("*"); 
        }
        int base = (altura/2)+1;
        for (int i=1;i<=base;i++) {
            System.out.print("* ");
        }
    }
}
