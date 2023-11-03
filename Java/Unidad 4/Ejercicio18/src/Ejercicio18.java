public class Ejercicio18 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce un número entero de como máximo 5 cifras");
        int n = Integer.parseInt(System.console().readLine());
        if (n<10) {
            System.out.println("La primera cifra del número es " + n);
        } 
        
        if ((n>=10) && (n<100)) {
            int primera = n/10;
            System.out.println("La primera cifra del número es " + primera);
        } 
        
        if ((n>=100) && (n<1000)) {
            int primera = n/100;
            System.out.println("La primera cifra del número es " + primera);
        } 
        
        if ((n>=1000) && (n<10000)) {
            int primera = n/1000;
            System.out.println("La primera cifra del número es " + primera);
        } 
        
        if (n>=10000) {
            int primera = n/10000;
            System.out.println("La primera cifra del número es " + primera);
        }
    }
}
