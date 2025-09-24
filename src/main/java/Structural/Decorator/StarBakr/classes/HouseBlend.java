package Structural.Decorator.StarBakr.classes;

public class HouseBlend extends Beverage {

    public HouseBlend(){
       description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 3.99;
    }
}
