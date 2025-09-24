package Structural.Decorator.StarBakr.classes;

public class DarkRoast extends Beverage {

    public DarkRoast(){
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 4.99;
    }
}
