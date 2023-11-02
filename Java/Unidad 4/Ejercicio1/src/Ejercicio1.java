import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce el día de la semana");
        String dia = s.nextLine();
        if ((dia.equals("Lunes")) || (dia.equals("Martes"))){
            System.out.println("Sistemas Informáticos");
        } else if ((dia.equals("Miercoles")) || (dia.equals("Viernes"))) {
                System.out.println("Base de Datos");
            } else if (dia.equals("Jueves")) {
                    System.out.println("Lenguaje de Marcas");
                }            s.close();

            }
}
