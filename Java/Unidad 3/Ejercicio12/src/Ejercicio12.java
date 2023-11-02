public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce la nota del primer examen");
        String linea1 = System.console().readLine();
        double nota1;
        nota1 = Double.parseDouble(linea1);
        System.out.println("¿Qué nota quieres sacar en el trimestre?");
        String linea2 = System.console().readLine();
        double nota2;
        nota2 = Double.parseDouble(linea2);
        double media_nota1 = nota2-(0.4*nota1);
        double nota_final = media_nota1/0.6;
        System.out.println("Para tener un " + nota2 + " en el trimestre necesitas sacar un " + nota_final + " en el segundo examen");
    }
}
