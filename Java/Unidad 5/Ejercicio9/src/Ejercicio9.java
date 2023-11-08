public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduzca un número");
        int num = Integer.parseInt(System.console().readLine());
        int digitos = 0;
        if (num<10) {
            System.out.println("Tu número tiene 1 dígito");
            digitos++;
        }
        int i = 100;
        int num_digitos = 2;
        while (digitos==0) {
            if (num<i) {
                System.out.println("Tu número tiene " + num_digitos + " dígitos");
                digitos++;
            } else if (num>=i) {
                i=i*10;
                num_digitos++;
            }
        }
    }
}
