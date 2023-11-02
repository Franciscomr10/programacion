public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Escribe el radio del cono en cm");
        String linea1 = System.console().readLine();
        double radio;
        radio = Integer.parseInt(linea1);
        System.out.println("Escribe la altura del cono en cm");
        String linea2 = System.console().readLine();
        double altura;
        altura = Integer.parseInt(linea2);
        double volumen = (Math.PI*Math.pow(radio, 2)*altura)/3;
        System.out.println("El volumen del cono es de " + volumen + " cm cúbicos");
    }
}
