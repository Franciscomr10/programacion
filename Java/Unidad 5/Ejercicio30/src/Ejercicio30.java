public class Ejercicio30 {
    public static void main(String[] args) throws Exception {
        System.out.println("Introduce la primera hora");
        System.out.print("Día: ");
        String dia_1 = System.console().readLine();
        System.out.print("Hora: ");
        int hora_1 = Integer.parseInt(System.console().readLine());
        while (hora_1>=24) {
            System.out.println("Has introducido una hora incorrecta, no puede superar las 24 horas.");
            System.out.print("Introduce una hora correcta: ");
            hora_1 = Integer.parseInt(System.console().readLine());
        }
        int horas = 0;
        int contandor1 = 0;
        switch (dia_1) {
            case "Lunes":
                horas=0;
                contandor1=1;
                break;
            case "Martes":
                horas=24;
                contandor1=2;
                break;
            case "Miércoles":
                horas=48;
                contandor1=3;
                break;
            case "Jueves":
                horas=72;
                contandor1=4;
                break;
            case "Viernes":
                horas=96;
                contandor1=5;
                break;
            case "Sábado":
                horas=120;
                contandor1=6;
                break;
            case "Domingo":
                horas=144;
                contandor1=7;
                break;
            default:
                break;
        }
        horas=horas+hora_1;
        System.out.println("Introduce la segunda hora");
        System.out.print("Día: ");
        String dia_2 = System.console().readLine();
        System.out.print("Hora: ");
        int hora_2 = Integer.parseInt(System.console().readLine());
        while (hora_2>=24) {
            System.out.println("Has introducido una hora incorrecta, no puede superar las 24 horas.");
            System.out.print("Introduce una hora correcta: ");
            hora_2 = Integer.parseInt(System.console().readLine());
        }
        int contandor2=0;
        int horas2=0;
        while (contandor2<contandor1) {
        switch (dia_2) {
            case "Lunes":
                horas2=0;
                contandor2=1;
                break;
            case "Martes":
                horas2=24;
                contandor2=2;
                break;
            case "Miércoles":
                horas2=48;
                contandor2=3;
                break;
            case "Jueves":
                horas2=72;
                contandor2=4;
                break;
            case "Viernes":
                horas2=96;
                contandor2=5;
                break;
            case "Sábado":
                horas2=120;
                contandor2=6;
                break;
            case "Domingo":
                horas2=144;
                contandor2=7;
                break;
            default:
                break;
        }
            if (contandor2<contandor1) {
                System.out.println("Has introducido un día anterior al que pusiste en primer lugar.");
                System.out.print("Introduce un día correcto: ");
                dia_2=System.console().readLine();
            }
            if (contandor1==contandor2) {
                while (hora_1>hora_2) {
                    System.out.println("Has introducido una hora menor a la que elegiste en primer lugar.");
                    System.out.print("Introduce una hora correcta: ");
                    hora_2=Integer.parseInt(System.console().readLine());
                }
            }
        }
        horas2=horas2+hora_2;
        int total_horas = horas2-horas;
        System.out.println("Las horas transcurridas son de: " + total_horas + " horas");
    }

}
