package concesionaria;

public class Auto extends Vehiculo{
    
    private int cantidadPuertas;
    private int cantidadAsientos;
    private String potenciaMotor;

    public Auto() {
    }

    public Auto(int cantidadPuertas, int cantidadAsientos, String potenciaMotor, int idVehiculo, String marca, String modelo, String color, String anioFabricacion, double precio) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cantidadPuertas = cantidadPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.potenciaMotor = potenciaMotor;
    }
    
     @Override
    public void hacerService () {
        System.out.println("Service de Auto realizado correctamente");
    }
    
    @Override
    public void otorgarGarantia () {
        System.out.println("Garantía otorgada a Auto correctamente");
    }
    
    @Override
    public void calibrarCubiertas () {
        System.out.println("Cubiertas de Auto calibradas correctamente");
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    public void setCantidadPuertas(int cantidadPuertas) {
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }

    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public String getPotenciaMotor() {
        return potenciaMotor;
    }

    public void setPotenciaMotor(String potenciaMotor) {
        this.potenciaMotor = potenciaMotor;
    }

  
    
    
    
}
