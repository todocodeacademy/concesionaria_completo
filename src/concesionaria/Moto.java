package concesionaria;

public class Moto extends Vehiculo{
    
    private String cilindrada;

    public Moto() {
    }

    public Moto(String cilindrada, int idVehiculo, String marca, String modelo, String color, String anioFabricacion, double precio) {
        super(idVehiculo, marca, modelo, color, anioFabricacion, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void hacerService () {
        System.out.println("Service de Moto realizado correctamente");
    }
    
    @Override
    public void otorgarGarantia () {
        System.out.println("Garantía otorgada a Moto correctamente");
    }
    
    @Override
    public void calibrarCubiertas () {
        System.out.println("Cubiertas de Moto calibradas correctamente");
    }

   
    
}
