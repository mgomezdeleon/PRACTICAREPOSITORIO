public class TablasAlumnos {
    public static void main(String[] args) {
        for (int numeroDeTabla = 1; numeroDeTabla <= 10; numeroDeTabla++) {
            System.out.println("Tabla de multiplicar del " + numeroDeTabla + ":");
            for (int i = 1; i <= 12; i++) {
                int resultado = numeroDeTabla * i;
                System.out.printf("%d x %d = %d%n", numeroDeTabla, i, resultado);
            }
            System.out.println(); // Agrega una línea en blanco entre las tablas
        }
    }
}

