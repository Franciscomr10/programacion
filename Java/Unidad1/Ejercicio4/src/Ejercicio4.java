public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        System.out.printf("%-12s %-12s %-12s %-12s \n", "\33[37mHoras", "     Lunes", "     Martes", "     Miércoles");
        System.out.printf("%-12s %-12s %-12s %-12s \n", "15:15", "\033[31mSistemas", "    Sistemas", "\033[34m    Base de Datos");
        System.out.printf("%-12s %-12s %-12s %-12s \n", "\33[37m16:15", "  \033[31m   Sistemas", "    Sistemas", "\033[34m    Base de Datos");
        System.out.printf("%-12s %-12s %-12s %-12s \n", "\33[37m17:15", "     \033[31mSistemas", "    Sistemas", "\033[32m    Programación");
        System.out.printf("%-12s %-12s %-12s %-12s \n", "\33[37m18:15", "     Descanso", "    Descanso", "    Descanso");
        System.out.printf("%-12s %-12s %-12s %-12s \n", "\33[37m18:30", "\033[96m     FOL", "\033[93m         Entornos", "\033[32m    Programación");
        System.out.printf("%-12s %-12s %-12s %-12s \n", "\33[37m19:30", "\033[96m     FOL", "\033[93m         Entornos", "\033[32m    Programación");
        System.out.printf("%-12s %-12s %-12s %-12s \n", "\33[37m20:30", "\033[96m     FOL", "\033[93m         Entornos", "\033[32m    Programación");
    }
}
