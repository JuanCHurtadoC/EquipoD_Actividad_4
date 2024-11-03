
package Backend;


public class Land extends Vehicle implements EngineLand {
    
    private String type;
    private City city;

    public Land(int power, int year, String brand, String type, City city) {
        super(power, year, brand);
        this.type = type;
        this.city = city;
    }
    public Land(String type, City city) {
    super(0,0,"");
    this.type = type;
    this.city = city;
    }

    @Override
    public String description() {
        return "vehiculo terrestre: " + brand + " (" + year + "), Tipo: " + type + "de la ciudad: " + city.getName();
    }

    @Override
    public String moveWheels() {
        return "El vehiculo se mueve con ruedas.";
    }
    public String getCityInfo(){
     return city.toString(); 
    }
     
}
