public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce los Mb que quieres pasar a Kb");
        String linea1 = System.console().readLine();
        double Mb;
        Mb = Integer.parseInt(linea1);
        double Kb = Mb*1024;
        System.out.println("La cantidad de " + Mb + " Mb en Kb es de " + Kb + " Kb");
    }
}
