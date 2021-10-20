package test;

public class Auto {

    public String modelo, marca;
    public int precio, registro;
    public static int cantidadCreados;
    public Asiento[] asientos;  // {1, null, 2, null}
    public Motor motor;

    public int cantidadAsientos() {
        int cantidadAsientos = 0;
        for (Asiento asiento: asientos){
            
            if (asiento != null){
                cantidadAsientos ++;
            }
        }
        return cantidadAsientos;
    }

    public String verificarIntegridad() {
        
        // Verificaci�n de asientos
        boolean asientosOriginales = true; 
        
        for (Asiento asiento: asientos){
            
            if (asiento != null && asiento.registro != motor.registro){
                asientosOriginales = false;
                break;
            }
        }
        
        // Verificar la originalidad de las dem�s partes
        if (motor.registro == registro && asientosOriginales){
            return "Auto original";        
        }
        else {
            return "Las piezas no son originales";
        }
    }
}