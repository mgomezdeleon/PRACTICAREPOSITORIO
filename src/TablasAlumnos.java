
public class TablasAlumnos {
			public static void main(String[] args) {
			System.out.println("Tablas de Multiplicar");
			imprimirTablas();
			}

			public static void imprimirTablas() {
				for (int i = 1; i <= 10; i++) {
					System.out.println("Tabla del " + i + ":");
					for (int j = 1; j <= 10; j++) {
						System.out.println(i + " x " + j + " = " + (i * j));
					}
					System.out.println(); // Agrega una línea en blanco entre cada tabla
				}
			
		}
	}


