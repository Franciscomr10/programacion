public class App {
    public static void main(String[] args) {
    // Los colores que vamos a usar si elige la opción de mostrar la tabla con color
    String RESET = "\033[0m"; // Text Reset
    String RED = "\033[41m"; // RED
    String GREEN = "\033[42m"; // GREEN
    String BLUE = "\033[44m"; // BLUE
    String PURPLE = "\033[45m"; // PURPLE
        System.out.print("Introduzca un número: ");
        long numIntro = Long.parseLong(System.console().readLine());
        long digito = 0;
        do {
            if (numIntro<0) {
                System.out.print("Has introducido un número inválido, Por favor Introduce un número mayor que 0");
                numIntro = Long.parseLong(System.console().readLine());
            }
        } while (numIntro<0);


        // Guardamos el número introducido por teclado para poder hacer operaciones con él en bucles, etc para así no perderlo
        long num = numIntro;
        long digito_mayor = 0;

        // Sacamos el dígito que tenga mayor valor para poder introducir el número de columnas
        while (num>0) {
            digito = num%10;
            num/=10;
            if (digito>digito_mayor) {
                digito_mayor=digito;
            }
        }
        System.out.print("Simple o en Color (escriba S o C): ");
        String eleccion = System.console().readLine();

        // Hacemos un if donde comprueba la elección que se ha hecho ya sea que introduzca una mayúscula o una minúscula
        if (eleccion.equals("s") || (eleccion.equals("S"))){

            // Le volvemos a dar el valor a num el número introducido por teclado y hacemos otro bucle para que pinte la tabla
            for (int i = 0; i<=digito_mayor; i++) {
                    System.out.printf("%-3s", " --- ");
                }
            long volteado = 0;
            num=numIntro;

            // Volteamos el número para que nos dé en el orden correcto los números
            while (num>0) {
                volteado = (volteado*10)+(num%10);
                num/=10;
            }
            while (volteado>0) {
                digito=volteado%10;
                System.out.println("");
                System.out.print("| " + digito + " |");

                // Introducimos un bucle for donde indicaremos que ponga un * dependiendo del número del dígito
                for (int i = 1;i<=digito;i++){
                    System.out.print("| * |");
                }

                for (int i = 1;i<=digito_mayor-digito;i++){
                    System.out.print("|   |");
                }

                System.out.println("");
                for (int i =0; i<=digito_mayor;i++){
                    System.out.printf("%-3s", " --- ");
                }
                volteado/=10;
            }
        } else if (eleccion.equals("C") || (eleccion.equals("c"))) {
            // Aquí haremos la tabla pero con los caractéres Unicode por lo que haremos más bucles para que quede todo
            // perfectamente alineado

            long volteado = 0;
            num=numIntro;
            while (num>0) {
                volteado = (volteado*10)+(num%10);
                num/=10;
            }

            System.out.print("\u2554");
            for (int i=1; i<=digito_mayor;i++){
                System.out.print("\u2550\u2550\u2550\u2566");
            }
            System.out.println("\u2550\u2550\u2550\u2557");

            while (volteado>0) {
                digito = volteado%10;
                System.out.print("\u2551 "+digito);

                // Ahora debemos de comprobar el valor dle digito para saber que color debemos de asignarlepor lo que hice varios ifs
                if (digito<=4) {
                    for (int i = 1; i<=digito;i++){
                    System.out.print(" \u2551 "+ RED + " " + RESET);
                    } 
                    for (int i=1;i<=digito_mayor-digito;i++){
                        System.out.print(" \u2551  ");
                    }
                } else if ((digito>=5) && (digito<=6)){
                    for (int i = 1; i<=digito;i++){
                    System.out.print(" \u2551 "+ GREEN + " " +RESET);
                    }
                    for (int i=1;i<=digito_mayor-digito;i++){
                        System.out.print(" \u2551  ");
                    }
                } else if ((digito>=7) && (digito<=8)){
                    for (int i = 1; i<=digito;i++){
                    System.out.print(" \u2551 "+ BLUE + " " + RESET);
                    }
                    for (int i=1;i<=digito_mayor-digito;i++){
                        System.out.print(" \u2551  ");
                    }
                } else if (digito==9){
                    for (int i = 1; i<=digito_mayor;i++){
                    System.out.print(" \u2551 "+ PURPLE + " " + RESET);
                    }
                    for (int i=1;i<=digito_mayor-digito;i++){
                        System.out.print(" \u2551  ");
                    }
                }
                System.out.print(" \u2551");
                System.out.println("");

                if (volteado>10){
                    System.out.print("\u2560");
                
                for (int i=1;i<=digito_mayor;i++){
                    System.out.print("\u2550\u2550\u2550\u256C");
                }

                System.out.print("\u2550\u2550\u2550\u2563");
                System.out.println("");
                } else {
                    System.out.print("\u255A");
                    for (int i=1; i<=digito_mayor;i++){
                        System.out.print("\u2550\u2550\u2550\u2569");
                    }
                    System.out.print("\u2550\u2550\u2550\u255D");
                }
                volteado/=10;
            }
            
        } else {
            System.out.println("No has introducido una elección válida");
        }
    }   
}