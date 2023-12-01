public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Te voy a sacar una carta de la baraja francesa.");
        String palo = String.valueOf((int)(Math.random()*(4-1+1)+1));
        switch (palo) {
            case "1":
                palo = "bastos";
                break;
            case "2":
                palo = "copas";
                break;
            case "3":
                palo = "oros";
                break;
            case "4":
                palo = "espadas";
                break;
            default:
                break;
        }
        
        String carta = String.valueOf((int)(Math.random()*(10-1+1)+1));
        switch (carta) {
            case "1":
                carta = "as";
                break;
            case "8":
                carta = "sota";
                break;
            case "9": 
            carta = "caballo";
                break;
            case "10":
            carta = "rey";
            break;
            default:
                break;
        }
        System.out.println("Tu carta es el " + carta + " de " + palo);
    }
}
