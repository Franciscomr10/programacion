public class Ejercicio33 {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduce la altura de la U: ");

        /// Pedimos la altura y calculamos la base de la U que sería igual que la altura menos 2 ya que en la base no tendrá
        /// 2 astericos para que tenga el efecto curvatura

        int altura = Integer.parseInt(System.console().readLine());
        int base = altura-2;

        /// Hacemos 2 bucles for, el primero para escribir los asteriscos utilizando como referencia la altura 
        /// y el segundo para saber los espacios que tenemos que dejar con la base que hemos calculado antes

        for (int i=0;i<altura;i++) {
            System.out.print("* ");
            for (int x = 0;x<base;x++) {
                System.out.print("  ");
            }
            System.out.println("*");
        }

        /// Hacemos otro bucle for para dibujar la base donde antes del bucle dejaremos un espacio para que de el efecto de curvatura
        /// y lo ponemos fuera del bucle para que no haga todo el rato la comprobación (cosa que hice al principio)

        System.out.print(" ");
        for (int b=1;b<=base;b++) {
                System.out.print(" *");
        }
    }
}
