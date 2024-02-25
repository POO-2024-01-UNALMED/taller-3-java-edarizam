package taller3.televisores;

public class TV {
	
	//Atributos
	private Marca marca;
	private int canal = 1;
	private int precio = 500;
	private boolean estado;
	private int volumen = 1;
	private Control control;
	private static int numTV;
	
	//Constructores
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
	}
	
	//Getters y setters

	public int getCanal() {
		return canal;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public void setCanal(int canal) {
		if (canal>= 1 && canal <= 120 && estado == true) {
			this.canal = canal;
		}
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		if (volumen>= 0 && volumen <= 7 && estado == true) {
			this.volumen = volumen;
		}
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	public static int getNumTV() {
		return numTV;
	}

	public static void setNumTV() {
		TV.numTV = 0;
	}

	//Methods
	public static void contadorTv() {
		numTV++;
	}
	
	public void turnOn(){
		this.estado = true;
	}

	public void turnOff() {
		this.estado = false;
	}

	public boolean getEstado() {
		return estado;
	}

	public void canalUp() {
		if (canal < 120 && estado == true) {
			canal++;
		}
	}

	public void canalDown() {
		if (canal > 1 && estado == true) {
			canal--;
		}
	}

	public void volumenUp() {
		if (volumen < 7 && estado == true) {
			volumen++;
		}
	}

	public void volumenDown() {
		if (volumen > 0 && estado == true) {
			volumen--;
		}
	}	
}
