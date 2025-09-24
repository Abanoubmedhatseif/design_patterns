package Structural.Decorator.StarBakr.classes.Decorators;

import Structural.Decorator.StarBakr.classes.Beverage;

public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+", mocha";
    }

    @Override
    public double cost() {
        return beverage.cost()+0.15;
    }
}
