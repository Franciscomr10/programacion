public class App {
    public static void main(String[] args) throws Exception {
    System.out.println("20 números aleatorios entre 0 y 10 ambos incluidos:");
    for (int i=0;i<20;i++){
        System.out.print((int)(Math.random()*(10-0+1)+0) + " ");
    }
    }
}