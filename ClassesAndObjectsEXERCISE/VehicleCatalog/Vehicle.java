package ClassesAndObjectsEXERCISE.VehicleCatalog;

public class Vehicle {
    private String type;
    private String model;
    private String colour;
    private int horsePower;

    public Vehicle(String type, String model, String colour, int horsePower) {
        this.type = type;
        this.model = model;
        this.colour = colour;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String toString() {
        return String.format("Type: %s\n" +
                "Model: %s\n" +
                "Color: %s\n" +
                "Horsepower: %d", getType().toUpperCase().charAt(0) + this.getType().substring(1), getModel(), getColour(), getHorsePower());
    }
}

