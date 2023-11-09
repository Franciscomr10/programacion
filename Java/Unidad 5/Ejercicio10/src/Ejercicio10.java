public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a calcular la media de los números que introduzcas a continuación.");
        System.out.println("Recuerda que si pones números negativos indicarás que has terminado de introducir números");
        double num, media, suma = 0;
        int i = 0;
        num=0;
        do {
            System.out.print("Introduce una nota: ");
            num = Double.parseDouble(System.console().readLine());
            if (num>=0 && num<11) { 
                suma = num + suma;
                i++;
            } else if (num>=11) { 
                System.out.print("Has introducido una nota invalida, vuelve a escribir la nota: ");
            }
        } while (num>=0);
        if (i>0) {
            media = suma/i;
            System.out.printf("Tu media de los números es de %.2f\n", media);
        } else {
            System.out.println("No has introducido ninguna nota válida");
        }
    }
}

