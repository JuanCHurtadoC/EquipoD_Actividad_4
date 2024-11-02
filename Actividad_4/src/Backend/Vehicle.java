package Backend;


abstract class Vehicle {
    
    protected int power;
    protected int year;
    protected String brand;
    
    
    // Getters y setters
    public int getPower() {
        return power;
    }
    
    public void setPower(int power){
        this.power = power;
    }
    
    public int getYear(){
        return year;
    }
    
    public void setyear(int year){
        this.year= year;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    // Constructor para iniciarlizar con los atributos
    public Vehicle(int power, int year, String brand){ 
        this.power = power;
        this.year = year;
        this.brand = brand;
    }
    
    // Método abstracto que será implementado en las subclases
    public abstract String description();
}
