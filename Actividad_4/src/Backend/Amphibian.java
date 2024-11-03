
package Backend;


public class Amphibian extends Vehicle implements EngineLand,EngineWater,WaterVehicle {
    
    private String type;

    public Amphibian(int power, int year, String brand) {
        super(power, year, brand);
        this.type = type;
    }

    @Override
    public String description() {
        return "Vehiculo anfibio: " + brand + " (" + year + "), Tipo: " + type;
    }

    @Override
    public String moveWheels() {
        return "El vehiculo se mueve en tierra con ruedas.";
    }

    @Override
    public String moveJetPropulsion() {
        return "El vehiculo se mueve agua con propulsion a chorro.";
    }

    @Override
    public void pathPrograming() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
