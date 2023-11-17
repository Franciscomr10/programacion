public class Ejercicio18 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce dos números enteros distintos");
        System.out.print("Primer número: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Segundo número: ");
        int num2 = Integer.parseInt(System.console().readLine());
        while (num1==num2) {
            System.out.print("El número introducido es igual que el primer número. Introduce un número diferente: ");
            num2=Integer.parseInt(System.console().readLine());
        }
        if (num1<num2) {
            for (int i=num1+7; i<num2; i=i+7) {
                System.out.println(i);
            }
        } else {
            for (int i=num2+7; i<num1; i=i+7) {
                System.out.println(i);
            }
        }
    }
}
