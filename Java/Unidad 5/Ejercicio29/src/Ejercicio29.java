public class Ejercicio29 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce otro número: ");
        int num2 = Integer.parseInt(System.console().readLine());
        for (int i=num; i>0;i--) {
            if (i%num2!=0) {
                System.out.println(i);
            }
        }
    }
}
