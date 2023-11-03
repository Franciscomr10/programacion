public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Este programa resuelve ecuaciones de segundo grado ax^2 + bx + c = 0");
        System.out.println("Introduce el valor de a");
        String linea1 = System.console().readLine();
        double a = Double.parseDouble(linea1);
        System.out.println("Introduce el valor de b");
        String linea2 = System.console().readLine();
        double b = Double.parseDouble(linea2);
        System.out.println("Introduce el valor de c");
        String linea3 = System.console().readLine();
        double c = Double.parseDouble(linea3);
        if (a!=0) {
            double interior_raiz = Math.pow(b, 2)-4*a*c;
            if (interior_raiz>=0) {
                double raiz = Math.sqrt(interior_raiz);
                double opcion1 = (-b+raiz)/2*a;
                double opcion2 = (-b-raiz)/2*a;
                if ((opcion1!=0) && (opcion2!=0)) {
                System.out.println("Los resultados de la ecuación de segundo grado son: x = " + opcion1 + "; x = " + opcion2);
                } else if ((opcion1==0) && (opcion2==0)) {
                    System.out.println("El resultado de la ecuación en ambas solucione es: x = 0");
                }
            } else if (interior_raiz<0) {
                System.out.println("No se puede seguir con la ecuación debido a que la raíz es negativa y quedaría de la siguiente forma: " + -b + "+/-√" + interior_raiz);
            }
        } else if (a==0) {
            System.out.println("Esta ecuación no tiene solución real debido a que el divisor es 0");
        }
    }
}
