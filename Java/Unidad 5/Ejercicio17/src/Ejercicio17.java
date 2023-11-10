public class Ejercicio17 {
    public static void main(String[] args) throws Exception {
        int suma = 0;
        System.out.print("Introduce un número entero y positivo: ");
        int num = Integer.parseInt(System.console().readLine());
        while (num<0) {
            System.out.print("Has introducido un número no válido, introduce uno válido: ");
            num= Integer.parseInt(System.console().readLine());
        }
        for (int i=num; i<num+101; i++) {
            suma = suma + i;
        }
        System.out.println("El resultado es " + suma);
    }
}
