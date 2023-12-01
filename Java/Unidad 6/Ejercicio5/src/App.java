public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("50 números entre 100 y 199 separados por espacios junto a su máximo, mínimo y su media");
        int suma = 0;
        int max=0;
        int min=200;
        int num=0;
        for (int i=0;i<50;i++){
            num = (int)(Math.random()*(199-100+1)+100);
            System.out.print(num + " ");
            if (num>max) {
                max=num;
            } else if (num<min) {
                min=num;
            }
            suma+=num;
        }
        suma/=50;
        System.out.println("La media de los números es de: " + suma);
        System.out.println("El máximo ha sido: " + max + " y el mínimo es de " + min);
    }
}
