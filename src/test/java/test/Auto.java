package test;

public class Auto {

	public String modelo, marca;
	public int precio, registro;
	public static int cantidadCreados;
	public Asiento[] asientos;
	public Motor motor;

	public int cantidadAsientos() {
		return asientos.length;
	}

	public String verificarIntegridad() {

		// Verificación de asientos
		boolean asientosOriginales = true;

		for (Asiento asiento : asientos) {

			if (asiento != null && asiento.registro != motor.registro) {
				asientosOriginales = false;
				break;
			}
		}

		// Verificar la originalidad de las demás partes
		if (motor.registro == registro && asientosOriginales) {
			return "Autor original";
		} else {
			return "Las piezas no son originales";
		}
	}
}