public class Ejercicio11     {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce que hora es actualmente (1-24)");
        String linea1 = System.console().readLine();
        int hora = Integer.parseInt(linea1);
        System.out.println("Ahora introduce que minuto es actualmente (1-59)");
        String linea2 = System.console().readLine();
        int minutos = Integer.parseInt(linea2);
        if (hora!=24) {
            if (minutos==0) {
                int horas = 24-hora;
                int segundos = horas*60*60;
                System.out.println("Quedan " + segundos + " segundos para la media noche");
            } else if (minutos!=0) {
                int minutos_seg = 60-minutos;
                int minuto = minutos_seg*60;
                int horas = 23-hora;
                int segundos = horas*60*60+minuto;
                System.out.println("Quedan " + segundos + " segundos para la media noche");
            }
        } else if (hora==24) {
            if (minutos==0) {
                System.out.println("Ya es media noche");
            } else if (minutos!=0) {
                int hora_2 = 1;
                int minutos_seg = 60-minutos;
                int minuto = minutos_seg*60;
                int horas = 24-hora_2;
                int segundos = horas*60*60+minuto;
                System.out.println("Quedan " + segundos + " segundos para la media noche");
            }
        }
    }
}
