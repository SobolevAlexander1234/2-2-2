package web.model;

public class Car {
    private String model;
    private String color;
    private int years;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public Car(String model, String color, int years) {
        this.model = model;
        this.color = color;
        this.years = years;
    }
    @Override
    public String toString() {
        return String.format("Car [color = %d, model = %s, years = %s", color, model, years);
    }
}
