public class Ejercicio8 {
    public static void main(String[] args) throws Exception {
        System.out.println("Escribe cuantas horas has trabajado esta semana");
        String linea1 = System.console().readLine();
        int horas;
        horas = Integer.parseInt(linea1);
        int salario = horas*12;
        System.out.println("El salario semanal después de trabajar " + horas + " horas es de " + salario + " euros");
    }
}
