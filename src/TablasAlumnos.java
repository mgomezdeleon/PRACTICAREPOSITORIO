
public class TablasAlumnos {
	
    public static void main(String[] args) {
        printTablasDeMultiplicar();
    }

    public static void printTablasDeMultiplicar() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Tablas De Multiplicar para " + i + ":");
            for(int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }
    }
}


