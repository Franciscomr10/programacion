public class Ejercicio11 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce los Kb que quieres pasar a Mb");
        String linea1 = System.console().readLine();
        double Kb;
        Kb = Integer.parseInt(linea1);
        double Mb = Kb/1024;
        System.out.println("La cantidad de " + Kb + " Kb en Mb es de " + Mb + " Mb");
    }
}
