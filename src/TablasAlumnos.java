
	public class TablasAlumnos {
			public static void main(String[] args) {
			System.out.println("Tablas de Multiplicar");
			System.out.println("Miguel Serna");
			imprimirTablasDeMultiplicar(10);
	}
	public static void imprimirTablasDeMultiplicar(int hasta) {
	        for (int i = 1; i <= 10; i++) {
	            System.out.println("Tabla del " + i + ":");
	            for (int j = 1; j <= hasta; j++) {
	                System.out.println(i + " x " + j + " = " + (i * j));
	            }
	            System.out.println(); // Separador entre tablas
	        }
	 }
			
	}


