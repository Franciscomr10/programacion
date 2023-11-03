public class Ejercicio7_8 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce la primera nota");
        String linea1 = System.console().readLine();
        double nota1 = Integer.parseInt(linea1);
        System.out.println("Introduce la segunda nota");
        String linea2 = System.console().readLine();
        double nota2 = Integer.parseInt(linea2);
        System.out.println("Introduce la tercera nota");
        String linea3 = System.console().readLine();
        double nota3 = Integer.parseInt(linea3);
        double media = (nota1+nota2+nota3)/3;
        if (media<5) {
            System.out.println("Tu media es de " + media + " por lo que tienes un insuficiente");
        } else if ((media>=5) && (media<6)){
            System.out.println("Tu media es de " + media + " por lo que tienes un suficiente"); 
        } else if ((media>=6) && (media<7)){
            System.out.println("Tu media es de " + media + " por lo que tienes un bien"); 
        } else if ((media>=7) && (media<9)){
            System.out.println("Tu media es de " + media + " por lo que tienes un notable"); 
        } else if (media>=9){
            System.out.println("Tu media es de " + media + " por lo que tienes un sobresaliente"); 
        }
    }   
}
