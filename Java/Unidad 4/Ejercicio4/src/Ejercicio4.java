public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana");
        String linea1 = System.console().readLine();
        int horas = Integer.parseInt(linea1);
        if (horas<=40) {
            int sueldo = horas*12;
            System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
        } else if (horas>41) {
            int res = 40*12;
            int horas_2 = horas-40;
            int sueldo = horas_2*16+res;
            System.out.println("El sueldo semanal que le corresponde es de " + sueldo + " euros");
        }
    }
}
