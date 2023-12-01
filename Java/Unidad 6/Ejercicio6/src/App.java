public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("He pensado en un número. Intenta adivinarlo. tienes 5 intentos");
        int num = (int) (Math.random() * (100 - 0 + 1) + 0);
        int numIntro = 0;
    
        for (int i = 5; i > 0; i--) {
            System.out.print("Introduce un número: ");
            numIntro = Integer.parseInt(System.console().readLine());
    
            if (numIntro == num) {
                System.out.println("Felicidades, has acertado el número");
                break;
            } else if (numIntro < num) {
                System.out.println("Has introducido un número menor al que he pensado. Te quedan " + (i - 1) + " intentos");
            } else if (numIntro > num) {
                System.out.println("Has introducido un número mayor al que he pensado. Te quedan " + (i - 1) + " intentos");
            }
        }
    
        if (numIntro != num) {
            System.out.println("No has acertado el número. El número era: " + num);
        }
    }    
}
