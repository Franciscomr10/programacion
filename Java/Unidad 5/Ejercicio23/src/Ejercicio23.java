public class Ejercicio23 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce los números que quieras pero si la suma supera el número 10000 se detendrá el programa");
        int num= 0;
        double media = 0;
        int contador = 0; 
        double suma = 0;
        Boolean terminar = false;
        do {
            System.out.print("Introduce un número: ");
            num = Integer.parseInt(System.console().readLine());
            if ((num>10000) || (num+suma>10000)) {
                System.out.println();
                System.out.println("la suma ha superado la cifra");
                terminar = true;
            } else {
                suma += num;
                contador++;
            }
        } while (terminar==false);
        if (contador>0){
        media = suma/contador;
        System.out.println("El total acumulado es de: " + suma);
        System.out.println("Has introducido un total de " + contador + " números");
        System.out.printf("La media de los números introducidos es de: %.2f", media);
        }
    }
}
