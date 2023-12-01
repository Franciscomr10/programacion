public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Te voy a sacar una carta de la baraja francesa.");
        String palo = String.valueOf((int)(Math.random()*(4-1+1)+1));
        switch (palo) {
            case "1":
                palo = "picas";
                break;
            case "2":
                palo = "corazones";
                break;
            case "3":
                palo = "diamantes";
                break;
            case "4":
                palo = "tréboles";
                break;
            default:
                break;
        }
        String carta = String.valueOf((int)(Math.random()*(13-1+1)+1));
        switch (carta) {
            case "1":
                carta = "A";
                break;
            case "11":
                carta = "J";
                break;
            case "12": 
            carta = "Q";
                break;
            case "13":
            carta = "K";
            break;
            default:
                break;
        }
        System.out.println("Tu carta es el " + carta + " de " + palo);
    }
}
