package Structural.Decorator.StarBakr.classes.Decorators;

import Structural.Decorator.StarBakr.classes.Beverage;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", milk";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.10;
    }


}
