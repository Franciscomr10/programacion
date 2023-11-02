public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce la hora que marque su reloj");
        String linea1 = System.console().readLine();
        int hora = Integer.parseInt(linea1);
        if ((hora>=6) && (hora<=12)) {
            System.out.println("Buenos días");
        } else if ((hora>=13) && (hora<=20)) {
            System.out.println("Buenas tardes");
        } else if ((hora>=21) || (hora<=5)) {
            System.out.println("Buenas noches");
        }
    }
}
