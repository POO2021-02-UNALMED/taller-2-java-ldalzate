package test;

public class Motor {

	// ATRIBUTOS
	int numeroCilindros;
	String tipo;
	int registro;

	// MÉTODOS
	void cambiarRegistro(int registro) {
		this.registro = registro;
	}

	void asignarTipo(String tipo) {
		if (tipo.equals("gasolina") || tipo.equals("electrico")) {
			this.tipo = tipo;
		}
	}
}