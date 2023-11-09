public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a calcular la media de los números que introduzcas a continuación.");
        System.out.println("Recuerda que si pones números negativos indicarás que has terminado de introducir números");
        double num, media = 0;
        int i = 1;
        System.out.print("Introduce una nota: ");
        num = Double.parseDouble(System.console().readLine());
        do {
            if (num>=0 && num<11) { 
                System.out.print("Introduce una nota: ");
                num = Double.parseDouble(System.console().readLine());
                media = num + media;
                i++;
            } else if (num>=11) { 
                System.out.print("Has introducido una nota invalida, vuelve a escribir la nota: ");
                num = Double.parseDouble(System.console().readLine());
            }
        } while (num>0);
        media = media/i;
        System.out.printf("Tu media de los números es de " + media);
    }
}

