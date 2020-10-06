package codes;

public class Main {

	public static void main(String[] args) {
		//Creo 10 hilos nuevos que muestra la tabla de potencias del 0 al 10
		Thread t;
		
		for (int i = 0; i < 11; i++) {
			t = new Thread(new Task(i));	//Creacion de un objeto Hilo con el objeto Tarea que implementa la interfaz Runnable
			
			if (i % 2 == 0) {	//Dependiendo del entero asociado al hilo le doy una prioridad
				t.setPriority(Thread.MAX_PRIORITY);	//Prioridad maxima
			} else {
				t.setPriority(Thread.MIN_PRIORITY);	//Prioridad minima
			}
			
			t.start();	//Inicio el hilo
		}

	}

}
