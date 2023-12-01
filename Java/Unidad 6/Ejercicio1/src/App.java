public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Vamos a tirar 3 veces de los dados y sumaré el resultado donde el número del dado representa los puntos que ganas");
        int dado=0;
        int suma=0;
        int tiradas=0;
        for (int i=0; i<3;i++){
            dado = (int)(Math.random()*(6-1+1));
            suma = dado + suma;
            tiradas++;
            System.out.println("En la " + tiradas + " tirada ha salido un " + dado);
            System.out.println("Llevas " + suma + " puntos");
        }
    }
}
