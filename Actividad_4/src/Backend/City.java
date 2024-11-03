package Backend;

public class City {
    private String name;
    private String code;

    public City(String name, String code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String toString() {
        return "Ciudad: Nombre:'" + name + "', codigo:'" + code + "'";
    }
}
