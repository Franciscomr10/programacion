public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un número del 1 al 7");
        String linea1 = System.console().readLine();
        int dia = Integer.parseInt(linea1);
        if (dia==1) {
            System.out.println("Lunes");
        } else if (dia==2) {
            System.out.println("Martes");
        } else if (dia==3) {
            System.out.println("Miércoles");
        } else if (dia==4) {
            System.out.println("Jueves");
        } else if (dia==5) {
            System.out.println("Viernes");
        } else if (dia==6) {
            System.out.println("Sábado");
        } else if (dia==7) {
            System.out.println("Domingo");
        }
    }
}
