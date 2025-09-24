package Structural.Decorator.StarBakr.classes;

public abstract class Beverage {

    String description="unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
