package codes;

public class Task implements Runnable {
	//Clase que muestra la tabla de potencia del entero que recibe
	private int num;

	public Task(int num) {
		this.num = num;
	}

	@Override
	public void run() {
		//Muestro por pantalla las potencias de ese numero
		for (int i = 0; i < 11; i++) {
			System.out.printf("%s %d ^ %d = %.0f\n", Thread.currentThread().getName(), num, i, Math.pow(num, i));
		}
	}
	
}
